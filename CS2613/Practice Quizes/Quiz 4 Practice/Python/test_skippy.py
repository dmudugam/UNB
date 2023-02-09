from skippy import Skippy

def test_wrap():
    skipper = Skippy(["Alice","Bob","Mallory","Sam","Tom"],2)
    assert [ next(skipper) for _ in range (7) ] \
    == ["Alice", "Mallory", "Tom", "Bob","Sam", "Alice", "Mallory"]

def test_reset():
	skipper = Skippy(list(range(10)),3)
	(res1,res2) = [],[]
	for j in skipper:
		res1.append(j)
		if len(res1) > 7:
			break
		
	for j in skipper:
		res2.append(j)
		if len(res2) > 7:
			break

	assert res1==res2
