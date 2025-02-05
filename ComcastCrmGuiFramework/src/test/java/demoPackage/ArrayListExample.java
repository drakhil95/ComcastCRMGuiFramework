package demoPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List cars = new ArrayList();  // adding values to arrayList
		cars.add("Lamborghini");
		cars.add("Mahindra");
		cars.add("TATA");
		cars.add(null);
		cars.add(null);
		cars.add("TATA");
		cars.add(3, "Koneigsegg");
		System.out.println(cars);
		
		
		List tata = new ArrayList();
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
	}
}
