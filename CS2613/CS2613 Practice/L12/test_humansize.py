from humansize import approximate_size

def test_1000():
    assert approximate_size(1000000000000, False) == "1.0 TB"

def test_1024():
    assert approximate_size(1000000000000) == "931.3 GiB"
    
def test_book_1():
    assert approximate_size(4000, False) == "4.0 KB"
