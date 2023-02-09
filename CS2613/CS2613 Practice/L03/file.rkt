#lang racket/base

(define (my-+ a b)
  (if (zero? a)
      b
      (my-+ (sub1 a) (add1 b))))

(define (my-* a b)
  (if (zero? a)
      0
      (my-+ (my-* (sub1 a) b) b)))

(provide my-+
         my-*)


(module+ test
  (require rackunit)
  (check-equal? (my-+ 1 1) 2 "Simple addition")
  (check-equal? (my-* 1 2) 2 "Simple multiplication")
  (check-equal? (my-* 10 10) 100 "Simple multiplication")
  (check-equal? (my-* 500 2) 1000 "Simple multiplication"))