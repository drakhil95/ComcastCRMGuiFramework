package assignmentString;


public class ReverseStringUsingRecursion {
	public static void main(String[] args) {
		String s = "Hello, My name is Akhilesh";
		int size = s.length() - 1;
		reverse(s, size);		
	}
	
	public static void reverse(String s, int a) {
		if (a<0) {
			return;
		}
		System.out.print(s.charAt(a));
		a--;
		reverse(s, a);
	}
}
