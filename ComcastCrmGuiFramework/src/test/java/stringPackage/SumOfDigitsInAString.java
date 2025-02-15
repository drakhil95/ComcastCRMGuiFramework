package stringPackage;

public class SumOfDigitsInAString {
	public static void main(String[] args) {
		String s = "123";
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch <= '9' && ch >= '1') {
				sum += Character.getNumericValue(ch);
			}
		}
		
		System.out.println(sum);
	}
}
