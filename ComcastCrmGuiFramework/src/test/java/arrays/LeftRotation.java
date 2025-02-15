package arrays;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		String s = "My name is Akhil";
		String[] sAr = s.split(" ");
		
		for (int i = 0; i < 6; i++) {
			String temp = sAr[0]; // First element will be overwritten so we save it in temp
			for (int j = 0; j < sAr.length -1; j++) {
				sAr[j] = sAr[j+1];
			}
			sAr[sAr.length - 1] = temp; // overriding the last value with the temp.
		}
		System.out.println(Arrays.toString(sAr));
	}
}
