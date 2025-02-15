package arrays;

import java.util.ArrayList;

public class BalancedString {
	public static void main(String[] args) {
		String str = "{}{}{}{}{}{}{}{}[]";
		ArrayList<Character> arrayList = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (arrayList.size() > 0 && 
					((str.charAt(i) == ']' && arrayList.get(arrayList.size() - 1) == '[') ||
					( str.charAt(i) == ')' && arrayList.get(arrayList.size() - 1) == ')') ||
					( str.charAt(i) == '}' && arrayList.get(arrayList.size() - 1) == '{') )) {
				arrayList.remove(arrayList.size() -1);
			}
			
			else 
				arrayList.add(str.charAt(i));
		}
		
		boolean b = arrayList.isEmpty();
		if (b)
			System.out.println("balanced");
		else
			System.out.println("Not balanced");
	}	
}
