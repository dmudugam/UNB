def make_counter(x):
    print('entering make_counter')
    while True:
        yield x
        print('incrementing x')
        x = x + 1

print('first')
counter = make_counter(100)
print('second')
print(next(counter))
print('third')
print(next(counter))
print('last')

def make_counter2(x):
    count = x
    def counter():
      nonlocal count
      if(count == x):
        print('entering the loop')
      else:
        print('increment x')
      tmp = count
      count = count + 1
      return tmp 
    return counter

