import re
rex=re.compile(r'([^0-9]+)')
for match in rex.findall('113abba999bjorn78910101benny888331dancing34234queen'):
    print(match)
