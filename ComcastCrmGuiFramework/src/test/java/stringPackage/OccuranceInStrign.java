package stringPackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceInStrign {

	public static void main(String[] args) {
		String s = "aabbabac";
		LinkedHashMap<Character, Integer> res = new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (res.containsKey(ch)) {// if the char is present then updating the value by 1
				res.put(ch, res.get(ch) + 1);
			}
			else { // if char is not present in the map, then add it
				res.put(ch, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> ref : res.entrySet()) {
			System.out.println(ref.getKey()+" => "+ref.getValue());
		}
	}
}
