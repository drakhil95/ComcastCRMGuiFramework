package assignmentString;

import java.util.LinkedHashMap;

public class OccuranceInString {
	public static void main(String[] args) {
		String s = "Hello how are you Hello";
		String[] ss = s.split(" ");
		LinkedHashMap<String, Integer> res = new LinkedHashMap<>();
		
		for (int i = 0; i < ss.length; i++) {
			String ch = ss[i];
			if (res.containsKey(ch)) {
				res.put(ch, res.get(ch) + 1);
			}
			else {
				res.put(ch, 1);
			}
		}
		
		System.out.println(res);
	}
}
