import re

def split_csv(string):
    return [ row.split(",") for row in string.splitlines() ]
    
def strip_quotes(string):
        strip_regex = re.compile(r'([^"]+)')
        search = strip_regex.search(string)
        if search:
            return search.group(1)
        else:
            return None
	
def split_csv2(string):
    return [ [strip_quotes(col) for col in row.split(",")] for row in string.splitlines()]
    
def split_row_3(string):
    split_regex=re.compile(
        r'''^   # start
        ("[^"]*"|[^,]*)     # column
        ,
        ("[^"]*"|[^,]*)     # column
        ,
        ("[^"]*"|[^,]*)     # column
        $''', re.VERBOSE)
    search = split_regex.search(string)
    if search:
        return [ strip_quotes(col) for col in search.groups() ]
    else:
        return None
        
def split_csv3(string):
    return [ [strip_quotes(col) for col in split_row_3(row)] for row in string.splitlines() ]
    
def split_row(string):
	col_regex = re.compile(r'("[^"]*"|[^,]+)')
	return [strip_quotes(col) for col in col_regex.findall(string)]
	
def split_csv4(string):
    return [ [strip_quotes(col) for col in split_row(row)] for row in string.splitlines() ]
