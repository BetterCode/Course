require 'test/unit'
require '../src/roman_number'

class RomanNumbersTest < Test::Unit::TestCase

	def test_one_in_roman_is_I() 
	   assertRomanNumber("I", 1)
        end
	
	
	private 
        def assertRomanNumber( expected, number)
	    romanNumber = RomanNumber.new number 
	    assert_equal expected, romanNumber.value
        end
end
