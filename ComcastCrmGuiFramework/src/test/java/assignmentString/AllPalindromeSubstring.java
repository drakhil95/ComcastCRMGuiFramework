package assignmentString;

public class AllPalindromeSubstring {
	public static void main(String[] args) {
		String s = "abcdcba";
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String res = s.substring(i, j);
				String rev = "";
				
				for (int k = res.length()-1; k >= 0; k--) {
					rev += res.charAt(k);
				}
				if (res.equals(rev))
					System.out.println(res);
			}
			System.out.println();
		}
	}
}
