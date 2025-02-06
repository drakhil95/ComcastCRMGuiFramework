package assignmentString;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class UniqueValuesInStringUsingMap {

	public static void main(String[] args) {
		String s = "Hello, how are you";
		LinkedHashMap<Character, Integer> res = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (res.containsKey(ch)) {
				res.put(ch, res.get(ch) + 1);
			}
			else {
				res.put(ch, 1);
			}
		}
		
		for (Entry<Character, Integer> ref : res.entrySet()) {
			if (ref.getValue() == 1) {
				System.out.println(ref.getKey());
			}
		}
	}

}
