import sieve
import sievegen
import timeit

print('sieve={:s}'.format(str(sieve.sieve(10))))
print('sievegen={:s}'.format(str(sievegen.sieve(10))))

print(timeit.timeit("sieve.sieve(1000000)","import sieve",number=100))
print(timeit.timeit("sievegen.sieve(1000000)", "import sievegen",number=100))
print(timeit.timeit("[x for x in sievegen.sieve(1000000)]", "import sievegen",number=100))
