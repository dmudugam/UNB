import re

test_string_2 = '''OPEID,INSTNM,TUITIONFEE_OUT
02503400,"Amridge University",6900
00100700,"Central Alabama Community College",7770
01218200,"Chattahoochee Valley Community College",7830
00101500,"Enterprise State Community College",7770
00106000,"James H Faulkner State Community College",7770
00101700,"Gadsden State Community College",5976
00101800,"George C Wallace State Community College-Dothan",7710
'''

# def split_csv(string):
#    return [ [strip_quotes(col) for col in row.split(",")] for row in string.splitlines() ]

def strip_quotes(string):
							# ^ and $ means we are matching the whole string. Outside the range brackets it means start of string
							# ? means c or nothing (previous thing is optional)
							# () means any character that is not a oduble quote
							# using * to allow zero length strings or more
	strip_regex = re.compile(r'"?([^"]*)"?')
	# strip_regex = re.compile(r'([^"]+)')
	search = strip_regex.search(string)
	if search:
		# Means whole match should be returned
		return search.group(1)
	else:
		return None
		
def split_row_3(string):
    split_regex=re.compile(
    	# The column you are in either has double quotes. If it is not double quoted then there should be no commas
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

def split_row(string):
	col_regex = re.compile(r'("[^"]*"|[^,]+)')
	return [strip_quotes(col) for col in col_regex.findall(string) ]

def split_csv(string):
    return [ [strip_quotes(col) for col in split_row(row)] for row in string.splitlines() ]
