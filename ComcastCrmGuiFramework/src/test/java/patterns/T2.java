package patterns;

public class T2 {
	public static void main(String[] args) {
		int row=3;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

}

}
