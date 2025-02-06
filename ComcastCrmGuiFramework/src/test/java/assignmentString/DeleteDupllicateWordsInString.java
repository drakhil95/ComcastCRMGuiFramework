package assignmentString;

import java.util.LinkedHashSet;

public class DeleteDupllicateWordsInString {
	public static void main(String[] args) {
		String s = "Hello how are you Hello";
		String[] ss = s.split(" ");
		LinkedHashSet<String> res = new LinkedHashSet<String>();
		
		for (int i = 0; i < ss.length; i++) {
			res.add(ss[i]);
		}
		System.out.println(res);
	}
}
