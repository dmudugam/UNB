#lang racket

(require xml)
(define (load-xexpr path)
  (xml->xexpr (document-element (read-xml (open-input-file path)))))

(require explorer)
(define data (load-xexpr "rubrics.xml"))
(explore data)

;Question 1 (Working)

(define (load-rubrics file-name)
  (list-tail (load-xexpr file-name) 2))


(module+ test
  (require rackunit)
  (define rubrics (load-rubrics  "rubrics.xml"))
  (check-equal? (length rubrics) 5)
  (for ([elt rubrics])
    (check-equal? (first elt) 'rubric)))

;Question 2 (Working)

(define (assoc* val lst)
  (match lst
    ['() #f]
    [(cons (list val2 val3) rst)
     (if (list? (first lst))
         (if (equal? val2 val) val3 (assoc* val (rest lst))) 
(assoc* val (rest lst)))]
    [(cons first rst) (assoc* val (rest lst))]))
          

(module+ test
  (define test-list '(1 [keep 2] 3 [keep 4] [keep 5] 6))
  (check-equal? (assoc* 'keep test-list) 2)
  (check-equal? (assoc* 'discard test-list) #f))

(define (rubric-name rubric)
  (assoc* 'name (second rubric)))

(module+ test
  (check-equal?
   (sort (map rubric-name rubrics) string<=?)
   '("JavaScript Assignment" "Journal Entry" "Octave Assignment" "Python Assignment"
                             "Racket assignment")))
;Question 3 (Working)

(define (assoc-all x lst)
  (match lst
    ['() '()]
    [(cons val1 val2) (if (and (list? val1) (> (length val1) 0))
                       (if (equal? (first val1) x)
                           (cons val1 (assoc-all x (rest lst)))
                           (assoc-all x (rest lst)))
                           (assoc-all x (rest lst)))]))



(module+ test
  (check-equal? (assoc-all 'keep test-list) '([keep 2] [keep 4] [keep 5])))

(define (criteria-groups rubric)
  (assoc-all 'criteria_group
             (assoc 'criteria_groups (rest rubric))))

(module+ test
  ;; Journals have one group, others have 2
  (check-equal? (sort (map length (map criteria-groups rubrics)) <=)
                '(1 2 2 2 2))
  (check-equal?
   (first ;; tag
    (first ;; first criteria group
     (criteria-groups (first rubrics))))
   'criteria_group))


;Question 4 (Working)

(define (criteria-levels list)
  (assoc-all 'level (third (third list))))

(module+ test
  (for ([level  (criteria-levels (first (criteria-groups (first rubrics))))])
    (check-equal? (first level) 'level)))

;Question 5 (Couldn't finish)

(define (level-name-score lst)
  (cond
    [(empty? lst) lst]
  (map (assoc-all 'name (first (first lst))) ((assoc-all 'criteria_group
             (assoc 'criteria_groups (rest lst)))))
  (level-name-score (rest lst))))

  
(module+ test
  (check-equal? (map level-name-score (criteria-levels (first (criteria-groups (first rubrics)))))
                '(("Needs improvement" 0)
                  ("Minimally satifactory" 1)
                  ("Good" 2)
                  ("Excellent" 3))))