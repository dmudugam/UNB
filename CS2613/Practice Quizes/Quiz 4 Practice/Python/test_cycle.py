from cycle import cycle

def test_small():
    lst = [1,2,3]
    g = cycle(lst)
    assert next(g) == lst
    assert next(g) == [2,3,1]
    assert next(g) == [3,1,2]

def test_big():
    n = 5000
    lst = list(range(n))
    g = cycle(lst)
    for j in range(n):
        lst2 = next(g)
    assert lst2[0] == n-1
    lst3 = next(g)
    assert lst3==lst
