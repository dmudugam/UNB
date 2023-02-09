#lang racket
    (define (hello) (displayln "Hello world!"))


(provide hello)

(module+ test
  (require rackunit)
  (check-equal? (with-output-to-string hello) "Hello world!\n"))