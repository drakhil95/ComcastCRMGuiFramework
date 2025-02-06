package demoPackage;

import java.util.HashMap;
import java.util.Map;

public class MpasExample {
	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(null, "JKL");
		m.put(3, "GHI");
		m.put(6, "GHI");
		m.put(9, "GHI");
		m.put(12, "GHI");
		m.put(2, "DEF");
		m.put(1, "ABC");
		m.put(0, null);
		System.out.println(m);
		
		
		m.remove(null); // removing the element
		System.out.println(m);
		
		m.remove(0,  null); // removing using both key-value pair
		System.out.println(m);
		
		System.out.println(m.containsKey(0)); // searching using the key
		
		System.out.println(m.containsValue("GHI")); // searching using the value
		
		System.out.println(m.get(2)); // fetching the value
		
		m.put(999, "ZZZ"); // adding one single value
		m.putAll(m);  // adding another map's key-value inside the current map, in this case we are adding the same map to itself
		System.out.println(m);  // no values seem to be added since the map does not allows duplicate keys
		
		
		m.replace(99, "Hello"); // trying to replace the value, if it does not finds it, it will not do anything
		
		
		for (Map.Entry<Integer, String> ref: m.entrySet()) {  // Iterating over the Map
			System.out.println(ref.getKey() + ref.getValue());
		}
	}
}
