def with_prefix(prefix, words):
	newWords = []
	
	newWords = [[x for x in words if prefix in x] for x in prefix]
	
	return newWords
