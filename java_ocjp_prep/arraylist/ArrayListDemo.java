import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	public static void main(String[] args) {

		//Pre Java 1.5 way of declaring and initialising an arraylist
		//This will throw compile error if you are uisng java 1.5 and above
		//To avoid compiler error use -Xlint:unchecked option in compiling, which will still show warning and passes the compilation
		/*
		ArrayList arrListOne = new ArrayList();
		ArrayList arrListTwo = new ArrayList(10);
		ArrayList arrListThree = new ArrayList(arrListTwo);
		*/

		//To overcome above, one more way to declare is as below and compile with -Xlint:unchecked 
		/*
		List myList = new ArrayList();
		myList.add("Basav");
		System.out.println("myList: " + myList.toString());
		*/

		ArrayList<String> birds = new ArrayList<>();
		//The add method alters the size of the ArrayList 
		birds.add("hawk"); //insert at beginning
		birds.add(1, "robin"); //insert behind hawk
		birds.add(0, "blue jay"); //push back hawk to 1 and insert at beginning 0
		birds.add(1, "cardinal"); //insert at 1, which will push hawk to 2
		System.out.println(birds); //This will implicitly call toString() on ArrayList (List interface)		
		//System.out.println("birds list: " + birds.toString());

		//The remove method alters the size of the ArrayList
		birds.remove(2); 
		System.out.println("After remove at 2 : " + birds);

		System.out.println(birds.remove("basav"));
		System.out.println(birds.remove("cardinal"));
		System.out.println("After remove object cardinal : " + birds);

		//Set method does not alter the List
		birds.set(0, "hawk");
		System.out.println("After set : " + birds);

		//Add by default adss elements at the end of the List (appends)
		birds.add("hawk"); //can add duplicates

		System.out.println("After duplicate add size: " + birds.size() + " elements: " + birds);
		
		birds.clear();
		System.out.println("is hawk in birds: " + birds.contains("hawk"));

		ArrayList<String> newBirds = new ArrayList<>();
		newBirds.clear();

		if(birds.equals(newBirds)) {
			System.out.println("ArrayLists are equal");
		} else {
			System.out.println("Differences found among ArrayLists");
		}

		
		//Converting ArrayList to Array
		birds.clear();
		birds.add("hawk");
		birds.add("robin");
		birds.add("blue jay");
		birds.add("cardinal");
		java.util.Collections.sort(birds); //Sorting an ArrayList
		String[] birdArray = birds.toArray(new String[birds.size()]);
		System.out.println("Bird array converted from ArrayList " + java.util.Arrays.toString(birdArray));

		//converting Array to ArrayList
		List<String> birdList = java.util.Arrays.asList(birdArray);
		System.out.println("Bird list converted from Array " + birdList);
		

		/*
		ArrayList<String> list = new ArrayList<>(); 
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length); // 2
		String[] stringArray = list.toArray(new String[0]); 
		System.out.println(stringArray.length); // 2
		*/

		List<String> hex = Arrays.asList("30", "8", "3A", "FF");
		Collections.sort(hex);
		int x = Collections.binarySearch(hex, "8");
		int y = Collections.binarySearch(hex, "3A");
		int z = Collections.binarySearch(hex, "4F"); 
		System.out.println(x + " " + y + " " + z);

		 List<Integer> ages = new ArrayList<>(); 
		ages.add(Integer.parseInt("5"));
		ages.add(Integer.valueOf("6"));
		ages.add(7);
		//ages.add(null); //This is a bad code, which will throw runtime exception
		for (int age : ages) 
			System.out.println(age);

		List<String> one = new ArrayList<String>(); one.add("abc");
		List<String> two = new ArrayList<>(); two.add("abc");
		
		if (one == two)
			System.out.println("A"); 
		else if (one.equals(two))
			System.out.println("B"); 
		else
			System.out.println("C");
	}
}
