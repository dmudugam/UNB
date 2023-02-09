from fib import fib, fib2

def test_fib():
    fun = fib2(1000)
    lst2 = []
    while True:
        n = fun()
        if n!=None:
            lst2.append(n)
        else:
            break
    assert lst2 == list(fib(1000))
