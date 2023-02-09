def list2dict(list):
    	#return { j+1 : list[j] for j in range(0,len(list))}
    	return { key+1 : val for key,val in enumerate(list)}
