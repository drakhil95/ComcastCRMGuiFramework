package demoPackage;

public class LCM {
	public static void main(String[] args) {
		int a =10, b= 25;
		int lcm = a*b/gCD(a, b);
		System.out.println(lcm);
	}
	
	public static int gCD(int a, int b) {
		 if (b == 0) {
		        return a;
		    }
		    return gCD(b, a % b);  // Recursive call
	}
	
}
