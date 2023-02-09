def read_csv(filename):
    '''Read a CSV file, return list of rows'''

    import csv
    with open(filename,'rt',newline='') as f:
        reader = csv.reader(f, skipinitialspace=True)
        return [ row for row in reader ]
        
def header_map(row):
	'''Parsing Headers'''
	
	return {value : key for key, value in enumerate(row)}
	
def select(table, data):
	'''Selecting Columns'''
	
	hmap = header_map(table[0])
	columns =[hmap[i] for i in list(data)]
	return [[row[j] for j in sorted(columns)] for row in table]
	
def row2dict(hmap, table):
	'''Transforming rows into dictionaries'''
	
	x = {}
	for key in hmap:
		x[key] = table[hmap[key]]
	return x
		
def check_row(row, st):
	'''Matching rows'''
	
	lft = st[0]
	opt = st[1]
	rgt = st[2]
	
	if(opt == 'AND'):
		return check_row(row, lft) and check_row(row, rgt)
		
	elif(opt == 'OR'):
		return check_row(row, lft) or check_row(row, rgt)
		
	elif(opt == '=='):
		return str(row[lft]) == str(rgt)
	
	elif(opt == '<='):
		return int(row[lft]) <= int(rgt)
		
	elif(opt == '>='):
		return int(row[lft]) >= int(rgt)
	else:
		raise Exception('Not a logical operation')
		
def filter_table(table, st):
	'''Filtering tables'''
	
	header = header_map(table[0])
	cell = table[1:]
	
	new_table = []
	new_table.append(table[0])
	
	for row in cell:
		n_dict = row2dict(header, row)
		if check_row(n_dict, st):
			new_table.append(row)
			
	return new_table
	
