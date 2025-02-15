package assignmentArray;

public class ThirdMaxValue {
	public static void main(String[] args) {
		int[] ar = {5, 6 ,3 ,1 ,7, 5, 3, 5 ,8, 0};
		int max = Integer.MIN_VALUE; 
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = ar[i]; 
			}
			else if(ar[i] > max && ar[i] != max) {
				secondMax = ar[i];
			}
			else if(ar[i] > secondMax && ar[i] != secondMax) {
				thirdMax = ar[i];
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Second Max: " + secondMax);
		System.out.println("Third Max: " + thirdMax);

	}
}
