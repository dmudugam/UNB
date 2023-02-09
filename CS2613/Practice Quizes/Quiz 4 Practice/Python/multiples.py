def multiples(n):
	return [[l for l in range(1,n+1) if l%x == 0] for x in range(1,n+1)]
