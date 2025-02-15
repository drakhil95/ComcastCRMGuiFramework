package arrays;

public class SecondMaxInArray {
	public static void main(String[] args) {
		int[] ar = {5, 6 ,3 ,1 ,7, 5, 3, 5 ,8};
		int secondMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE; 
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				secondMax = max;
				max = ar[i];
			}
			else if(ar[i] < max && ar[i] != max) {// If we dont write ar[i]!=max, it will assign the max value to the secondMax
				secondMax = ar[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Second Max: " + secondMax);
	}
}
