
import pytest

from client import approximate_size

def test_1000():
    assert approximate_size(1000000000000, False) == "1.0 TB"

def test_1024():
    assert approximate_size(1000000000000) == "1.0 TB"
    
def test_docstring():
    assert approximate_size.__doc__ != None
    
def test_negative():
	with pytest.raises(ValueError):
    		approximate_size(-1)
    		
def test_big():
	with pytest.raises(ValueError):
    		approximate_size(9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999)
