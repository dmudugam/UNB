from divisive import fraction
import math

def test_fraction_int():
    assert fraction(4,2) == 2;

def test_fraction_NaN():
    assert math.isnan(fraction(4,0))
