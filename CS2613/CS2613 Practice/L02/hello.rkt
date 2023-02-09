#lang slideshow

(require pict/flash)

(display "Hello World\n")

(define c (circle 10))

(define r (rectangle 10 20))

(define (square n)
  (filled-rectangle n n))

(hc-append (circle 10) (rectangle 10 20))

(hc-append 20 c r c)

(define (four p)
  (define two-p (hc-append p p))
  (vc-append two-p two-p))

(define (checker p1 p2)
  (let ([p12 (hc-append p1 p2)]
        [p21 (hc-append p2 p1)])
    (vc-append p12 p21)))

;Part_5
(define (checkerboard p)
  (let* ([rp (colorize p "red")]
         [bp (colorize p "black")]
         [c (checker rp bp)]
         [c4 (four c)])
    (four c4)))

;Part_6
(define (series mk)
  (hc-append 4 (mk 5) (mk 10) (mk 20)))

(define series1
  (lambda (mk)
    (hc-append 4 (mk 5) (mk 10) (mk 20))))

;Part_7

(define (rgb-series mk)
  (vc-append
   (series (lambda (sz) (colorize (mk sz) "red")))
   (series (lambda (sz) (colorize (mk sz) "green")))
   (series (lambda (sz) (colorize (mk sz) "blue")))))

;Part_8
(define (rgb-maker mk)
  (lambda (sz)
    (vc-append (colorize (mk sz) "red")
               (colorize (mk sz) "green")
               (colorize (mk sz) "blue"))))

;Part_9
(define (rainbow p)
  (map (lambda (color)
         (colorize p color))
       (list "red" "orange" "yellow" "green" "blue" "purple")))

