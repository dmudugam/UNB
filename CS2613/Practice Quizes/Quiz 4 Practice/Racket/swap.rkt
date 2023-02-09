#lang racket

;Swap Pairs
(define (swap-pairs lst)
  (cond
  [(empty? lst) empty]
  [(> (length (first lst)) 2) 'error]
  [(< (length (first lst)) 2) 'error]
  [else (cons (reverse (first lst)) (swap-pairs (rest lst)))]))


(module+ test
  (require rackunit)
  (check-equal? (swap-pairs '((1 2) (3 4) (5 6))) '((2 1) (4 3) (6 5))))

;sixes and Sevens
(define (sixes-and-sevens lst)
  (cond
    [(empty? lst) empty]
    [(or (= 0 (remainder (first lst) 6)) (= 0 (remainder (first lst) 7))) (cons (first lst) (sixes-and-sevens (rest lst)))]
    [else (sixes-and-sevens (rest lst))]))


(module+ test
  (require rackunit)
  (check-equal? (sixes-and-sevens '(1 6 7 12)) '(6 7 12)))


;Tree Map
(define (tree-map func lst)
  (cond
  [(empty? lst) '()]
  [(list? (first lst)) (cons (tree-map func (first lst)) (tree-map func (rest lst)))]
  [else (cons (func (first lst)) (tree-map func (rest lst)))]))

(module+ test
  (require rackunit)
  (check-equal? (tree-map add1 '()) '())
  (check-equal? (tree-map add1 '(1 2 3)) '(2 3 4))
  (check-equal? (tree-map (lambda (x) (* x x)) '(1 2 3)) '(1 4 9))
  (check-equal? (tree-map sub1 '(1 (2 3))) '(0 (1 2)))
  (check-equal? (tree-map (lambda (x) (modulo x 2))
                          '((1 2) (3 4) 5 (6 (7))))
                '((1 0) (1 0) 1 (0 (1))))
  (check-equal? (tree-map (lambda (x)
                            (string-append "I wanna " x))
                          '("pony" ("xbox" "A+")))
                '("I wanna pony" ("I wanna xbox" "I wanna A+"))))

;List to Hash
(define (list->hash lst)
  (define (helper lst-in count map)
    (cond
      [(empty? lst-in) map]
      [else (helper (rest lst-in) (add1 count) (hash-set map count (first lst-in)))]))
  (helper lst 1 (hash)))
  

(module+ test
  (require rackunit)
  (define hash-table (list->hash (list "a" "b" "c")))
  (check-equal? (hash-ref hash-table 1) "a")
  (check-equal? (hash-ref hash-table 2) "b")
  (check-equal? (hash-ref hash-table 3) "c")
  (check-equal? hash-table (hash 1 "a" 2 "b" 3 "c")) ;; check entire table, no extra elements
  (check-equal? (list->hash (list)) (hash)) ;; handle empty list
  (check-equal? (list->hash (list 1 2 3)) (hash 1 1 2 2 3 3)) ;; handle list of numbers
  (check-equal? (list->hash (list 1 "b" 'c) )  (hash 1 1 2 "b" 3 'c)))