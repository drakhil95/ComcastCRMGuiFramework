package arrays;

import java.util.Arrays;

public class AllZeroesOnLeftSIde {
	public static void main(String[] args) {
		int[] ar = {8, 9, 3, 4 ,0, 4, 0, 6, 0, 7, 0};
		int[] res = new int[ar.length]; // All values in this array will contain zeroes
		int index = res.length - 1;
//Since all elements are already zeroes, we can add all no zeroes values from the end
		for (int i = ar.length - 1; i >= 0; i--) {
			if (ar[i] != 0) {
				res[index--] = ar[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}
}
