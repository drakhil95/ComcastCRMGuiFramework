package stringPackage;

public class ReverseStringSpecialCase {
	public static void main(String[] args) {
		String s = "Hello, My name is Akhilesh"; // output should be: hselih kA siem an yM,olleH
		String s2 = s.replace(" ", "");
		int index = s2.length() - 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.print(" ");
			}
			else {
				System.out.print(s2.charAt(index));
				index--;
			}	
		}
	}
}
