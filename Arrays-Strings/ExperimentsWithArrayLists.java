import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class ExperimentsWithArrayLists{
	public static void main(String[] args){
		// Create & Initialize ArrayList
		Integer[] intArray = {1, 2, 5, 7, 9};
		List<Integer> myNumber = Arrays.asList(intArray);
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anna");
		names.add("Joe");
		names.add("Radha");
		names.add("Poppy");
		names.add("Nuren");

		// Reverse
		Collections.sort(myNumber, Collections.reverseOrder());
		Collections.sort(names, Collections.reverseOrder());

		System.out.println("\nArrayList of ints in descending order: ");
		for (Integer num: myNumber){
			System.out.println(num);
		}

		System.out.println("\nArrayList of names in descending order: ");
		for(String name: names){
			System.out.println(name);
		}

		// Sort
		Collections.sort(myNumber);
		System.out.println("\nArrayList in ascending order: ");
		for(Integer num: myNumber){
			System.out.println(num);
		}

		//Return a sublist
		ArrayList<String> sublist = new ArrayList<String>(names.subList(0, 3));
		System.out.println("\nSublist stored in ArrayList: " + sublist);

		//Copy one ArrayList to another
		ArrayList<String> copyList = new ArrayList<String>(sublist);
		System.out.println("\nCopied list: " + copyList);

		// Length
		int count = names.size();
		System.out.println("\nSize of names ArrayList: " + count);

		//Is it empty?
		if (names.isEmpty()){
			System.out.println("\nYou've got no names in that array list\n");
		}
		else{
			System.out.println("\nEnough names in here.\n");
		}

		//Convert into an Array
		String [] friends = names.toArray(new String[names.size()]);
		for (String friend: friends){
			System.out.println(friend);
		}

		//Return an element
		String nameElement = names.get(2);
		String friendElement = friends[2];
		System.out.println("\nReturning an ArrayList element: " + nameElement);
		System.out.println("Returning an Array element: " + friendElement);

		//Remove an element -- easier with an ArrayList
		names.remove(1);

		//Replace an element
		names.set(0, "Olive");

		//Add a new element
		names.add("Sita");

		//Join two ArrayLists
		List<String> joined = new ArrayList<String>(names);
		joined.addAll(copyList);
		System.out.println("\nJoining two arraylists:\n");
		for(String e : joined){
			System.out.println(e);
		}

	}
}
