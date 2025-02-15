package patterns;

public class PyramidTriangle3 {
	public static void main(String[] args) {
		int row=5;
		for (int i = 1; i <=row; i++) {
			//For Spaces
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			for (int j = i-1; j >= 1; j--) {
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
