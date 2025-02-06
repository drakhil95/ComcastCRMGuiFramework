package demoPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();  // adding values to arrayList
		cars.add("Lamborghini");
		cars.add("Mahindra");
		cars.add("TATA");
		cars.add(null);
		cars.add(null);
		cars.add("TATA");
		cars.add(3, "Koneigsegg");
		System.out.println(cars);
		
		
		List<Object> tata = new ArrayList<Object>();
		tata.add("Harrier");
		tata.add("Punch");
		
		tata.addAll(cars);  // Adding one collection's element to the other
		tata.add(cars); // adding one collection at once in array
		System.out.println(tata);
		
		
		Object res1 = cars.remove(0);  // res1 = "Lamborghini"
		boolean res2 = cars.remove(null); // res2 = true
		boolean res = cars.remove("AUDI"); // res3 = false    ....no errors
		System.out.println(cars);
		
		
		tata.removeAll(cars);  // removing all elements of cars from tata
		System.out.println(tata);
		tata.removeAll(tata); // removing all elements of tata from tata thus an empty list
		System.out.println(tata);
		
		System.out.println(cars.contains("TATA")); // checking if the cars are present in the list
		System.out.println(cars.contains("Jaguar")); // checking if the cars are present in the list
		
		System.out.println(cars.indexOf("TATA")); // 1, present in the list
		System.out.println(cars.indexOf("JAguar")); // -1, not present in the list
		
		tata.addAll(cars);
		System.out.println(tata.containsAll(cars));
		System.out.println(cars.containsAll(tata));
		
		tata.retainAll(cars); // removing all the uncommon elements
		System.out.println(tata);
		
		System.out.println(tata.get(2)); // searching for the element , arrayindexoutofbounds if index out of bounds
		
		for (Object object : tata) {
			System.out.println(object);
		}
		
		Iterator<Object> i = tata.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		ListIterator<Object> li = tata.listIterator();
		
		
		while(li.hasNext())
			System.out.println("**" + li.next());
		
		while(li.hasPrevious())
			System.out.println("==" + li.previous());
	}
}
