package stringPackage;

public class SumOfDigitsInAString {
	public static void main(String[] args) {
		String s = "123akjsfhljkasd982345jasjdf8778483478khadkhflaks";
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch <= '9' && ch >= '1') {
				sum += (ch-48);
			}
		}
		
		System.out.println(sum);
	}
}
