package assignmentString;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueWordsInString {
	public static void main(String[] args) {
		String s  = "Hello how are you Hello";
		String[] ss = s.split(" ");
		HashMap<String, Integer> res = new HashMap<String, Integer>();
		for (int i = 0; i  < ss.length; i++) {
			String s1 = ss[i];
			if (res.containsKey(s1)) {
				res.put(s1, res.get(s1) + 1);
			}
			else {
				res.put(s1, 1);
			}
		}
		
		for (Map.Entry<String, Integer> ref: res.entrySet()) {
			if (ref.getValue() == 1) {
				System.out.println(ref.getKey());
			}
		}
	}
}
