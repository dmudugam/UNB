import math

def fraction(a,b):
	try:
		return a/b
	except ZeroDivisionError:
		return math.nan
