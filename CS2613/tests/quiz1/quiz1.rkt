#lang racket

;Question 1
(define (sum lst)
  (define (helper lst sumT)
    (cond
      [(empty? lst) sumT]
      [(number? (first lst)) (helper (rest lst) (+ sumT (first lst)))]
      [else (helper (rest lst) sumT)]))
  (helper lst 0))

(module+ test
  (require rackunit)
  (check-equal? (sum '()) 0) ;checks for an empty list.
  (check-equal? (sum '(1 2)) 3) ;checks for normal condition with two elements.
  (check-equal? (sum '(1 2 "buckle my shoe")) 3) ;checks with a string to check the functionality.
  (check-equal? (number? 42) #t) ;checks for booleans.
  (check-equal? (sum '(1 2 (3 4))) 3) ;checks for elements with list inside a list.
  (check-= (sum '(1.0 2.0)) 3.0 0.0001)) ;checks for floating numbers.