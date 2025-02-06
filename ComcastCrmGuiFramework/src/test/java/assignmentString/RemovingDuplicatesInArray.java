package assignmentString;

import java.util.HashSet;

public class RemovingDuplicatesInArray {
	public static void main(String[] args) {
		int[] ar = {1, 2 ,3 ,4, 5, 6 ,4 ,2, 1, 7, 9, 9};
		
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for (int i = 0; i < ar.length; i++) {
			hash.add(ar[i]);
		}
		
		for (Integer integer : hash) {
			System.out.println(integer);
		}
	}
}
