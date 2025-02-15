package arrays;

public class MinMaxInArray {
	public static void main(String[] args) {
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		int min = ar[0];
		int max = ar[0];
		
		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i])
				max = ar[i];
			if (min > ar[i])
				min = ar[i];
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}
