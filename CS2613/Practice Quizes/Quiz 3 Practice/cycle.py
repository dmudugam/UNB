def cycle(lst):
	while(True):
		yield lst
		first_element = lst[0]
		lst = lst[1:len(lst):]
		lst.append(first_element)
