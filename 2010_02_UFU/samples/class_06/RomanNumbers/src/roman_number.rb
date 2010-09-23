
class RomanNumber 

	def initialize(number) 
	  @number = number
          ones = ["", "I", "II", "III", "IV","V", "VI", "VII", "VIII", "IX"]
	  tens = ["", "X", "XX", "XXX", "XL","L", "LX", "LXX", "LXXX", "XC"]
	  cents = ["", "C", "CC", "CCC","CD", "D", "DC", "DCC", "DCCC", "CM"]

          @romans = [cents, tens, ones]
        end

	def value() 
	  factor = 100
	  value = ""
	  @romans.each do | list |
	    value = value + list[ @number / factor]
	    @number %= factor
	    factor /= 10
          end
	  value
        end
end
