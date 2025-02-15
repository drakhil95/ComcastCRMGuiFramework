package arrays;

import java.util.Arrays;

public class AllZeroesOnRightSide {
	public static void main(String[] args) {
		int[] ar = {8, 9, 3, 4 ,0, 4, 0, 6, 0, 7, 0};
		int[] res = new int[ar.length]; // All values in this array will contain zeroes
		int index = 0;
//we add all non zeroes from the beginning		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				res[index++] = ar[i]; 
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
