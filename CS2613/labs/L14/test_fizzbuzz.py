import pytest
from fizzbuzz import fizz_body

def test_buzz():
	assert fizz_body(5) == 'Buzz'
