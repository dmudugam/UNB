def make_counter(x):
    print('entering make_counter')
    while True:
        yield x
        print('incrementing x')
        x = x + 1

print('-----output from funct  1-----')
print('first')
counter = make_counter(100)
print('second')
print(next(counter))
print('third')
print(next(counter))
print('last')

#no idea how this works
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

print('-----output from funct  2-----')
print('first')
counter = make_counter2(100)
print('second')
print(counter())
print('third')
print(counter())
print('last')
