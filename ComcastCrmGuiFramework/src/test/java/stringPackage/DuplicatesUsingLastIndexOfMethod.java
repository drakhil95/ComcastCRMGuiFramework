package stringPackage;

public class DuplicatesUsingLastIndexOfMethod {
	public static void main(String[] args) {
		String s  = "aanmcdsjhsadlfosadgfoj";
		for (int i = 0; i  < s.length(); i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch) != s.lastIndexOf(ch) && i == s.indexOf(ch))
				/* Second condition is to only to print the repeated characters only once since in the
				 first occurrence of the char, the indexOf() of the char will be equal to the iteration of'i' */
				System.out.println(ch);
		}
	}
}
