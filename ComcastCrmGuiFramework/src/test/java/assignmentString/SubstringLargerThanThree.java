package assignmentString;

public class SubstringLargerThanThree {
	public static void main(String[] args) {
		String s = "abacacaca";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String res = s.substring(i, j);
				
				if (res.length() > 3)
					System.out.print(res + " ");
			}
			System.out.println();
		}
	}
}
