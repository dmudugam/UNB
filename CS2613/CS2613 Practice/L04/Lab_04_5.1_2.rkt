#lang racket

(define (list-length list)
  (if (empty? list)
      0
      (+ 1 (list-length (rest list)))))

(list-length '(1 2 3))