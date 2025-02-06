package stringPackage;

public class ReverseWithoutVariable {
	public static void main(String[] args) {
		String s = "Hello World, Hi my name is Akhil";
		String rev = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {  // This uses the third variable
			rev += s.charAt(i);
		}
		System.out.println(rev);
		
		for (int i = s.length() - 1; i >= 0; i--) {  // This is without using the third variable
			System.out.print(s.charAt(i));
		}	
	}
}
