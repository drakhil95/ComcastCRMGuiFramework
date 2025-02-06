package stringPackage;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWIthLinkedSet {

	public static void main(String[] args) {
		LinkedHashSet<Character> res = new LinkedHashSet<>();
		String s = "HEllo, WOrld!!";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			res.add(ch);
		}
		
		System.out.println(res);
 	}

}
