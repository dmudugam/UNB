import re
'''
def is_word(str):
	pattern_for_odd = 'b|k|p|t|z'
	pattern_for_even = 'a|e|i|o|u'
	for i in range(len(str)):
		current_char = str[i]
		if(i%2 == 0):
			if(re.search(pattern_for_even, current_char) == None):
				return False
		else:
			if(re.search(pattern_for_odd, current_char) == None):
				return False
	return True	
'''
'''
def is_word(sl):
	match_found = re.search('^[^aeiou]', sl)
	if(match_found != None):
		return False
	sl2 = re.sub('([bkptz][aeiou])+', '', sl)	
	
	if(len(sl2) > 1):
		return False	
	return True	
'''	

def group_checker(sl):
	return re.sub('[bkptz][aeiou]', '', sl)	

def is_word(sl):
	pattern = ('^[aeiou]([bkptz][aeiou])+$')
	return bool(re.match(pattern, sl))
