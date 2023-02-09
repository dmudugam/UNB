from akataka import is_word

def test_match():
      assert is_word("akataka") == True
      assert is_word("ububu") == True
      assert is_word("ikekezaza") == True

def test_extra():
      assert is_word("akatakaa") == False
      assert is_word("uububu") == False

def test_bad_letter():
      assert is_word("yakataka") == False
      assert is_word("akatakala") == False

def test_consonant_start():
      assert is_word("kakataka") == False
      assert is_word("bububu") == False

