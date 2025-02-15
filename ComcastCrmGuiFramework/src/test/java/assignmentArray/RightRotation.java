package assignmentArray;

import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		String s = "My name is Akhil";
		String[] sAr = s.split(" ");
		
		for (int i = 0; i < 6; i++) {
			String temp = sAr[sAr.length - 1]; // First element will be overwritten so we save it in temp
			for (int j = sAr.length - 1; j > 0; j--) {
				sAr[j] = sAr[j-1];
			}
			sAr[0] = temp; // overriding the last value with the temp.
		}
		System.out.println(Arrays.toString(sAr));
	}
}
