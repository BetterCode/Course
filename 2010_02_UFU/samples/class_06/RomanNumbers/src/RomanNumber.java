import java.util.Arrays;
import java.util.List;

public final class RomanNumber {

	private int number;
	private final List<String> ones = Arrays.asList("", "I", "II", "III", "IV",
			"V", "VI", "VII", "VIII", "IX");
	private final List<String> tens = Arrays.asList("", "X", "XX", "XXX", "XL",
			"L", "LX", "LXX", "LXXX", "XC");
	private final List<String> cents = Arrays.asList("", "C", "CC", "CCC",
			"CD", "D", "DC", "DCC", "DCCC", "CM");

	@SuppressWarnings("unchecked")
	private final List<List<String>> romans = Arrays.asList(cents, tens, ones);

	public RomanNumber(int number) {
		this.number = number;
	}

	public String value() {
		int factor = 100;
		final StringBuilder value = new StringBuilder();
		for (List<String> list : romans) {
			value.append(list.get(number / factor));
			number %= factor;
			factor /= 10;
		}
		return value.toString();
	}
}
