#lang racket

(module+ test
  (require rackunit))

(define (count-odds lst)
  (cond
    [(empty? lst) 0]
    [(odd? (first lst)) (add1 (count-odds (rest lst)))]
    [else (count-odds (rest lst))]))

(module+ test
  (check-equal? (count-odds (list 3 2 1 1 2 3 4 5 5 6)) 6))

(define (count-odds2 lst)
  (define (helper lst odds)
    (cond
      [(empty? lst) odds]
      [(odd? (first lst)) (helper (rest lst) (add1 odds))]
      [else (helper (rest lst) odds)]))
  (helper lst 0))

(module+ test
  (check-equal? (count-odds2 (list 3 2 1 1 2 3 4 5 5 6)) 6)
  (define random-list (build-list 100 (lambda (x) (random 1 100))))
  (check-equal? (count-odds random-list) (count-odds2 random-list)))

;Part_5
(define (count-odds3 lst)
  (for/fold
      ([odds 0])
      ([n lst])
    (cond
      [(odd? n) (add1 odds)]
      [else odds])))

(module+ test
  (check-equal? (count-odds3 (list 3 2 1 1 2 3 4 5 5 6)) 6)
  (check-equal? (count-odds random-list) (count-odds3 random-list))
  (check-equal? (count-odds3 (list 3 2 1 1 2 3 4 5 5 6)) 6))

;Part_6.1
(define (my-map f lst)
      (match lst
        ['() '()]
        [(cons first rest) (cons (f first)
                                (my-map f rest))]))

    (module+ test
      (require rackunit)
      (check-equal? (my-map sub1 '(1 2 3)) '(0 1 2)))

;Part_6.2
(define (list-length lst)
  (match lst
    ['() 0]
    [(cons head tail) (+ 1 (list-length tail))]))

(module+ test
    (require rackunit)
    (check-equal? (list-length '(1 2 3)) 3)
    (check-equal? (list-length '()) 0))


 (define (my-map2 f lst)
      (match lst
        ['() '()]
        [(list head tail ...) (cons (f head)
                                    (my-map2 f tail))]))

(define (list-length2 lst)
  (match lst
    ['() 0]
    [(list head tail ...) (+ 1 (list-length tail))]))

(module+ test
    (require rackunit)
    (check-equal? (list-length2 '(1 2 3)) 3)
    (check-equal? (list-length2 '()) 0))

;Part_6.3
(define (calc expr)
  (match expr
    [(? number? n) n]
    [`(plus ,l ,r) (+ (calc l) (calc r))]
    [`(times ,l ,r) (* (calc l) (calc r))]
    [`(sub ,l ,r) (- (calc l) (calc r))]
    [`(div ,l ,r) (/ (calc l) (calc r))]
    [_ (error 'calc "syntax error")]))
    
(module+ test
  (require rackunit)
  (check-equal? (calc '(plus 1 2)) 3)
  (check-equal? (calc '(plus (plus 1 2) 3)) 6)
  (check-equal? (calc '(times (plus 1 2) 3)) 9)
  (check-equal? (calc '(div (times (plus 1 2) 3) 3)) 3)
  (check-equal? (calc '(sub (div (times (plus 1 2) 3) 3) 3)) 0))

