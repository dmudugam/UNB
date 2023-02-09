class Counter:
    "Simulation of generator using only __next__ and __init__"
    def __init__(self,x):
        self.x = x
        self.first = x

    def __next__(self):
	if self.x == self.first:
		print('enter make_counter')
	print("incrementing x')



        self.x = self.x + 1
        return self.x - 1

if __name__ == '__main__':
	print('first')
	counter = Counter(100)
	print('second')
	print(next(counter))
	print('third')
	print(next(counter))
	print('last')
