from prefixes import with_prefix

words=["apple","baby","abba"]
a_words=["apple", "abba"]
def test_simple():
    assert list(with_prefix(["a"],words)) == [a_words]
def test_order():
    assert list(with_prefix(["b","a"],words)) == [["baby"], a_words]
def test_multi():
    assert list(with_prefix(["bb","ab"],words)) == [[],["abba"]]

def test_regex1():
    assert list(with_prefix(["[a-z]b"], words)) == [ ["abba"] ]
def test_regex2():
    assert list(with_prefix([".*a$"], words)) == [ ["abba"] ]

def test_gen():
    gen = with_prefix(["b"],words)
    assert next(gen) == ["baby"]
