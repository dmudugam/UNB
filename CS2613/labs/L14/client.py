import humansize

def approximate_size(size, a_kilobyte_is_1024_bytes=False):
	'''Convert a file size to human-readable form.'''
	return humansize.approximate_size(size, a_kilobyte_is_1024_bytes)
	
	
if __name__=='__main__': #pragma: no cover
	print(approximate_size(1000000000000, False))
	print(approximate_size(1000000000000, True))
	print(approximate_size(1000000000000))
