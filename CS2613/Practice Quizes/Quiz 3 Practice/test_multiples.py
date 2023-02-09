from multiples import multiples

def test_1():
      assert multiples(1)== [ [1] ]

def test_4():
      assert multiples(4)==[[1, 2, 3, 4], [2, 4], [3], [4]]

def test_10():
      assert multiples(10) == [[1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
                               [2, 4, 6, 8, 10], [3, 6, 9],
                               [4, 8], [5, 10],
                               [6], [7], [8], [9], [10]]

