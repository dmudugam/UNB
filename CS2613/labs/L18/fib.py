class Fib:
	def __init__(self,max):
        	self.max = max
        	self.a = 0
        	self.b = 1

	def __next__(self):
		if self.a < self.max:
			tmp = self.a
			self.a = self.b
			self.b += tmp
			#self.a,self.b = self.b, self.a+self.b
			return tmp
		else:
			raise StopIteration

	def __iter__(self):
		self.a = 0
		self.b = 1
		return self
