package assignmentString;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInArray {
	public static void main(String[] args) {
		int[] ar = {1, 2 ,3 ,4, 5, 6 ,4 ,2, 1, 7, 9, 9};
		
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < ar.length; i++) {
			if (hash.containsKey(ar[i])) {
				hash.put(ar[i], hash.get(ar[i]) + 1);
			}
			else {
				hash.put(ar[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> ref: hash.entrySet()) {
			if (ref.getValue() > 1) {
				System.out.println(ref.getKey());
			}
		}
	}
}
