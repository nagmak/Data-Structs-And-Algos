import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayList{
	public static void main(String[] args){
		// Create & Initialize ArrayList
		List<Integer> myNumber = Arrays.asList(1, 2, 5, 7, 9);
		List<String> names = ArrayList<String>();
		names.add("Anna");
		names.add("Joe");
		names.add("Radha");
		names.add("Poppy");
		names.add("Nuren");

		// Reverse
		Collections.sort(myNumber, Collections.reverseOrder());
		Collections.sort(names, Collections.reverseOrder());

		System.out.println("ArrayList in descending order: ");
		for (Integer num: myNumber){
			System.out.println(num);
		}

		for(String name: names){
			System.out.println(name);
		}

		// Sort
		Collections.sort(myNumber);
		System.out.println("ArrayList in ascending order: ");
		for(Integer num: myNumber){
			System.out.println(num);
		}

		//Return a sublist

		//Copy one ArrayList to another

		//Number of elements vs length

		//Is it empty?

		//Convert into an Array

		//Return an element

		//Remove an element

		//Replace an element

		//Add a new element

		//Join two ArrayLists

	}
}