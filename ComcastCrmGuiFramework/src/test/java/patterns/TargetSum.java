package patterns;

import java.util.LinkedHashSet;

public class TargetSum {

	public static void main(String[] args) {
		int[] a = { 10, 5, 7, 8, 6, 9, 9, 10, 7 };
		int targetSum = 15; // adding the two elements with the sum equals to 15
		
		LinkedHashSet<String> hash = new LinkedHashSet<String>();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == targetSum) {
					String res = a[i] > a[j] ? "(" + a[j] + "," + a[i] + ")" : "(" + a[i] + "," + a[j] + ")";
					hash.add(res);
				}
			}
		}
		System.out.println(hash);
		String val = String.valueOf(targetSum);
		System.out.println(val);
	}
}
