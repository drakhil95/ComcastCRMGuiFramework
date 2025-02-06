package stringPackage;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String a = "PAN";
		String b = "NAP";

		if (a.length() == b.length()) {
			a = a.toLowerCase();
			b = b.toLowerCase();

			char[] ch1 = a.toCharArray();
			char[] ch2 = b.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2))
				System.out.println("Anagram");
			else 
				System.out.println("Not an anagram");
		}
		else 
			System.out.println("Not an anagram");
	}
}
