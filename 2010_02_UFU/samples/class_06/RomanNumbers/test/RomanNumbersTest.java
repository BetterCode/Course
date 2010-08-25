import static org.junit.Assert.*;

import org.junit.Test;



public class RomanNumbersTest {

	@Test
	public void oneInRomanIsI() throws Exception {
		assertRomanNumber("I", 1);
	}
	
	@Test
	public void twoInRomanIsII() throws Exception{
		assertRomanNumber("II", 2);
	}
	
	@Test
	public void fourInRomanIsIV() throws Exception {
		assertRomanNumber("IV", 4);
	}
	
	@Test
	public void fiveInRomanIsV() throws Exception {
		assertRomanNumber("V", 5);
	}
	
	
	@Test
	public void eightInRomanIsVIII() throws Exception {
		assertRomanNumber("VIII", 8);
	}
	
	@Test
	public void nineInRomanIsIX() throws Exception {
		assertRomanNumber("IX", 9);
	}
	
	@Test
	public void tenInRomanIsX() throws Exception {
		assertRomanNumber("X", 10);
	}
	
	@Test
	public void elevenInRomanIsXI() throws Exception {
		assertRomanNumber("XI", 11);
	}
	
	@Test
	public void _14InRomanIsXIV() throws Exception {
		assertRomanNumber("XIV", 14);
	}
	
	@Test
	public void _29InRomanIsXXIX() throws Exception {
		assertRomanNumber("XXIX", 29);
	}
	
	@Test
	public void _49InRomanIsXLIX() throws Exception {
		assertRomanNumber("XLIX", 49);
	}
	
	@Test
	public void _99InRomanIsXCIX() throws Exception {
		assertRomanNumber("XCIX", 99);
	}
	
	@Test
	public void _101InRomanIsCI() throws Exception {
		assertRomanNumber("CI", 101);
	}	
	
	private void assertRomanNumber(String expected, int number){
		RomanNumber romanNumber = new RomanNumber(number);
		assertEquals(expected, romanNumber.value());
	}
}
