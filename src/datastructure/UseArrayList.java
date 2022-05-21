package datastructure;
import java.util.ArrayList;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		// creating an array list
		ArrayList<String> animals = new ArrayList();
		animals.add("Cow");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println("ArrayList: " + animals);

		// add component to array list
		animals.add("Mouse");

		// remove component from array list
		String str = animals.remove(2);

		// change component on array list
		animals.set(1, "Tiger");

		// iterate using for-each loop
		System.out.println("Accessing individual elements:  ");

		for (String language : animals) {
			System.out.print(language);
			System.out.print(", ");
		}
	}
}


