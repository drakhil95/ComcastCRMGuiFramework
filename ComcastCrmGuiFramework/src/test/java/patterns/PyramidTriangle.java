package patterns;

public class PyramidTriangle {
	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <=row; i++) {
			
			//For Spaces
			for (int j = 0; j < (row - i); j++) {
				System.out.print(" ");
			}
			
			// For stars
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
