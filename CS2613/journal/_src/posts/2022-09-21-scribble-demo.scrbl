#lang scribble/manual

Title: Scribble Demo
Date: 2022-09-21T09:44:36
Tags: PUBLISHED

Replace this with your post text. Add one or more comma-separated
Tags above. The special tag `DRAFT` will prevent the post from being
published.

<!-- more -->

@(define (hello) "hello")
@(define (todo hdr . lst) (list (bold hdr) (apply itemlist (map item lst))))
@(define (greet thing) (string-append "hello" thing))
@hello{}

@todo["Shopping" "cheese" "fish" "shuriken"]

@greet{Cookie Monster}
