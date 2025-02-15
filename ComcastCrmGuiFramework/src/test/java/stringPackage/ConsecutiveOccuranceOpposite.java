package stringPackage;

public class ConsecutiveOccuranceOpposite {
	public static void main(String[] args) {
		String s = "a3b3a2b2c2a1b1c1";
		for (int i = 0; i < s.length(); i+=2) {
			char ch = s.charAt(i);
			int count = s.charAt(i+1) - 48;
			for (int j = 0; j < count;j++) {
				System.out.print(ch);
			}
		}
	}
}
