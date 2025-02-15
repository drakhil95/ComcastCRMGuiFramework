package arrays;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class PositionsOfDuplicateElementInArray {
	public static void main(String[] args) {
		int [] a = {1 ,2, 3, 4, 5, 6, 7 ,5, 4, 3, 2, 2 ,2, 7 ,5, 6, 7};
		LinkedHashMap<Integer, ArrayList<Integer>> map = new LinkedHashMap<>();
		
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.get(a[i]).add(i); // Adding the index of the repeating elements into the arrayList of that particular value
			}
			else {
				map.put(a[i], new ArrayList<Integer>());
				map.get(a[i]).add(i);
			}
		}
		
		
		for (Map.Entry<Integer, ArrayList<Integer>> ref: map.entrySet()) {
			if (ref.getValue().size() > 1) {
				System.out.println(ref.getKey() + " : " + ref.getValue());
			}
		}		
	}
}
