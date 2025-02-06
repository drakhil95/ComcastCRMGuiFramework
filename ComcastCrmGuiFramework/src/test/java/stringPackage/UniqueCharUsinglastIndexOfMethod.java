package stringPackage;

public class UniqueCharUsinglastIndexOfMethod {
	public static void main(String[] args) {
		String s  = "aanmcdsjhsadlfosadgfoj";
		for (int i = 0; i  < s.length(); i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch) == s.lastIndexOf(ch)) // Using the 
				System.out.println(ch);
		}
	}
}
