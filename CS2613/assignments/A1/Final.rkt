#lang racket

;Part_1
(define (drop-divisible x lst)
   (filter (lambda (y) (or (= y x)(< 0 (remainder y x)))) lst))

;Part_2
(define (sieve-with divisors lst)
  (foldl drop-divisible lst divisors))

;Part_3
(define (sieve n)
  (sieve-with (range 2 n) (range 2 n)))


(module+ test
  (require rackunit)
  (check-equal? (drop-divisible 3 (list 2 3 4 5 6 7 8 9 10)) (list 2 3 4 5 7 8 10)))

(module+ test
    (check-equal? (sieve-with '(2 3) (list 2 3 4 5 6 7 8 9 10)) (list 2 3 5 7))
    (check-equal? (sieve-with '() (list 2 3 4 5 6 7 8 9 10)) (list 2 3 4 5 6 7 8 9 10)))

;Part_4
(module+ test
  (require math/number-theory)
  (check-equal? (sieve 10) (list 2 3 5 7))
  (check-equal? (filter prime? (range 2 10)) (sieve 10)))
