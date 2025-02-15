package stringPackage;

public class ConsecuitveOccurance {
	public static void main(String[] args) {
		String s = "aaabbbaabbab";
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch == s.charAt(i + 1)) {
				count++;
			}
			else {
				System.out.print(""+ch+count);
				count = 1;
			}
		}
		System.out.print(""+ s.charAt(s.length()-1)+count);
		// The last character is printed separately since there's no next character to trigger printing from the
		// else block
	}
}
