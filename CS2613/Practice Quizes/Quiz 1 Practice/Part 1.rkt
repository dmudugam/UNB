#lang racket

(define (swap-pairs lst)
  (cond
  [(empty? lst) empty]
  [(> (length (first lst)) 2) 'error]
  [(< (length (first lst)) 2) 'error]
  [else (cons (reverse (first lst)) (swap-pairs (rest lst)))]))

(define (sixes-and-sevens lst)
  (cond
    [(empty? lst) empty]
    [(or (= 0 (remainder (first lst) 6)) (= 0 (remainder (first lst) 7))) (cons (first lst) (sixes-and-sevens (rest lst)))]
    [else (sixes-and-sevens (rest lst))]))

(define (tree-map expr)
  (match expr
    [`((lambda (x)), ) (* (tree-map x) (tree-map x))]))

(module+ test
  (require rackunit)
  (check-equal? (swap-pairs '((1 2) (3 4) (5 6))) '((2 1) (4 3) (6 5))))

(module+ test
  (require rackunit)
  (check-equal? (sixes-and-sevens '(1 6 7 12)) '(6 7 12)))

(module+ test
  (require rackunit)
  (check-equal? (tree-map (lambda (x) (* x x) '(1 2 3))) '(1 4 9)))