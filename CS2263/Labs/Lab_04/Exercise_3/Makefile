GCC = gcc
CFLAGS = -g -Wall -Wshadow

prog: htags2.o htags3.o htags2.o
	$(GCC) $(CFLAGS) htags2.o htags3.o htags1.o -o prog

htags2.o: htags2.c
	$(GCC) $(CFLAGS) -c htags2.c

htags3.o: htags3.c
	$(GCC) $(CFLAGS) -c htags3.c

htags1.o: htags1.c
	$(GCC) $(CFLAGS) -c htags1.c

testAll: test1 test2

test1: prog
	./prog < inputs/input1.html > outputs/output1

test2: prog
	./prog < outputs/output1 > outputs/output2
	diff outputs/output1 outputs/output2
