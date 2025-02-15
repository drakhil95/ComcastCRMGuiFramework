package patterns;

public class PyramidTriangle2 {				//with no spaces between stars
	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = i; j <= row; j++) {
				System.out.print("  ");  //two spaces
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
