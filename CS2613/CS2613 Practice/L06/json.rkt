#lang racket

(require explorer)
(require json)

(define (read-json-file file-name)
  (with-input-from-file file-name read-json))

(define (visualize-json-file file-name)
  (explore (read-json-file file-name)))

(define (collect-status file-name)
  (define json (read-json-file file-name))
  (define errors (hash-ref json 'errors))
  (define (helper in-lst acc)
    (cond
      [(empty? in-lst) acc]
      [else (helper (rest in-lst) (cons (hash-ref (first in-lst) 'status) acc))]))
    (reverse (helper errors '())))

(module+ test
  (require rackunit)
  (check-equal? (collect-status "errors.json") '("403" "422" "500")))

(define (collect-status2 file-name)
    (define json (read-json-file file-name))
  (define errors (hash-ref json 'errors))
  (define (helper in-lst acc)
    (cond
      [(empty? in-lst) acc]
      [else (helper (rest in-lst)   (cons (hash-ref (first in-lst) 'status) acc))]))
  (reverse (helper errors '())))

(module+ test
  (check-equal? (sort (collect-status "errors.json") string<?)
                (sort (collect-status2 "errors.json") string<?)))