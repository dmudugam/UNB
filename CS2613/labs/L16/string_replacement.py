'100 NORTH MAIN ROAD'.replace('ROAD', 'RD.')
s = '100 NORTH BROAD ROAD'
s.replace('ROAD', 'RD.')
# oops
s[:-4] + s[-4:].replace('ROAD', 'RD.')
# ugh, that code
import re
re.sub('ROAD$', 'RD.', s)
# what dark magic is this?

s = '100 BROAD'
re.sub('ROAD$', 'RD.', s)
# New regex feature \b.
re.sub('\\bROAD$', 'RD.', s)
# Raw strings reduce \ overload
re.sub(r'\bROAD$', 'RD.', s) #r tells python not to interperet the the text
# Our new regex is too "narrow"
s = '100 BROAD ROAD APT. 3'
re.sub(r'\bROAD$', 'RD.', s)
re.sub(r'\bROAD\b', 'RD.', s) #Since road is not at the end, we need to add \b


# re terms to use
# % is end of string
# ^ Beginning of string
# \b word boundary (Meaning it should be a word by itself) - When we add to end it ignores the last statements
# \r interpret the string literarly

import re
rex=re.compile(r'([^0-9]+)')
rex2=re.compile(r'([a-z]+)')
for match in rex.findall('113abba999bjorn78910101benny888331dancing34234queen'):
    print(match)
# [] indicates range
# [^] negated range (Eveerything that is the range)
# + (normally after sqare brackets) means one or more. It send each match back as a single character and concatenate it until you don't reach a match. If it reaches a not match then it is a new line.
