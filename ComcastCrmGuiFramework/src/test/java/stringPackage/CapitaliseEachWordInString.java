package stringPackage;

public class CapitaliseEachWordInString {
	public static void main(String[] args) {
		String s = "hello my name is akhilesh";
		String [] ss = s.split(" ");
		for (int i = 0; i < ss.length; i++) {
			String s1 = ss[i];
			char ch = Character.toUpperCase(s1.charAt(0));
			System.out.print(ch + s1.substring(1) + " ");
		}
		
	}
}
