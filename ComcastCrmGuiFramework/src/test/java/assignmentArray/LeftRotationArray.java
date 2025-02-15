package assignmentArray;

import java.util.Arrays;

public class LeftRotationArray {
	public static void main(String[] args) {
		int[] sAr = {1, 2, 3, 4, 5, 6};
		
		for (int i = 0; i < 5; i++) {
			int temp = sAr[0]; // First element will be overwritten so we save it in temp
			for (int j = 0; j < sAr.length -1; j++) {
				sAr[j] = sAr[j+1];
			}
			sAr[sAr.length - 1] = temp; // overriding the last value with the temp.
		}
		System.out.println(Arrays.toString(sAr));
	}
}
