def fizz_body(i):
	if(i%3 == 0 and i%5 == 0):
		return "FizzBuzz"
	elif(i%5 == 0):
		return "Buzz"
	else:
		return "{:d}".format(i)
		
for i in range(1,101):
	print(fizz_body(i))

for i in range(1,101):
    if (i%3 == 0 and i%5 == 0):
    	print("FizzBuzz")
    elif (i%5==0):
    	print("Buzz")
    else:
    	print(i)
