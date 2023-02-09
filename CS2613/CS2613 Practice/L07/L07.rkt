#lang racket
(define-syntax-rule (And a b)
  (if b a #f))

(module+ test
  (require rackunit)
  (define (die)
    (error 'die "don't run this"))

  (check-equal? (And (die) #f) #f)
  (check-exn exn:fail? (lambda () (and (die) #f))))



(module+ test
  (define-syntax-rule (check-fail expr)
    (check-exn exn:fail? (lambda () expr)))
  (check-fail (and (die) #f))
  (check-fail (And #f (die))))

;Part 4.2
(define-syntax-rule (Or a b)
  (if (not b) a #t))

(module+ test
  (check-equal? (Or #t #t) #t)
  (check-equal? (Or #f #t) #t)
  (check-equal? (Or #t #f) #t)
  (check-equal? (Or (die) #t) #t)
  (check-fail (or (die) #t)))

;Part 4.3

(module+ test
  (check-equal? (let* ([x 5]
                       [y (- x 3)])
                      (+ y y))
                4)
  (check-equal? (let* ([x 5]
                       [y (- x 3)]
                       [y x])
                       (* y y))
                25))


(define-syntax Let*
  (syntax-rules ()
    [(Let* () body) body]
    [(Let* ([first-id first-val] [id val] ...) body)
     (let ([first-id first-val])
       (Let* ([id val] ...) body))]))

(module+ test
  (require rackunit)
  (check-equal? (Let* ([x 5] [y (- x 3)]) (+ y y)) 4)
  (check-equal? (Let* ([x 5] [y (- x 3)] [y x]) (* y y)) 25))