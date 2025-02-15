package assignmentArray;

public class ThirdMinValue {
	public static void main(String[] args) {
		int[] ar = {5, 6 ,3 ,1 ,7, 5, 3, 5 ,8, 0};
		int min = Integer.MAX_VALUE; 
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				thirdMin = secondMin;
				secondMin = min;
				min = ar[i];
			}
			else if(ar[i] < min && ar[i] != min) {
				secondMin = ar[i];
			}
			else if(ar[i] < secondMin && ar[i] != secondMin) {
				thirdMin = ar[i];
			}
		}
		System.out.println("Min: " + min);
		System.out.println("Second Min: " + secondMin);
		System.out.println("Third Min: " + thirdMin);

	}
}
