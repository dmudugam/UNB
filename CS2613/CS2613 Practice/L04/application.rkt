#lang racket

(require "hello.rkt")

(module+ test
  (require rackunit)
  (check-equal? (with-output-to-string hello) "Hello world!\n")
  (check-equal? (with-output-to-string hello) (begin (sleep 3) "Hello world!\n")))