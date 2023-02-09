class Skippy:
	def __init__(self, lst, k):
		self.lst = lst
		self.k = k
		self.counter = 0
	
	def __next__(self):
		if(self.counter == 0):
			self.counter = self.counter + self.k
			return self.lst[0]
		else:
			self.counter = self.counter + self.k
			return self.lst[(self.counter-self.k)%len(self.lst)]
			
	def __iter__(self):
		self.counter = 0
		return self
