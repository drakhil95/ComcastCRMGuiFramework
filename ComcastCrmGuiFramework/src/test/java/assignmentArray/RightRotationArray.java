package assignmentArray;

import java.util.Arrays;

public class RightRotationArray {
	public static void main(String[] args) {
		int[] sAr = {1, 2, 3, 4, 5, 6};
		
		for (int i = 0; i < 5; i++) {
			int temp = sAr[sAr.length - 1]; 
			for (int j = sAr.length - 1; j > 0; j--) {
				sAr[j] = sAr[j-1];
			}
			sAr[0] = temp;
		}
		System.out.println(Arrays.toString(sAr));
	}
}
