import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class DemoArray {
	int[] numArray;

	String[] strArray;

	public DemoArray () {
		//This is initlising it with a size, what happens if this statement is not used
		//If this is not initlised, a null pointer exception is thrown at run time, though code will compile
		numArray = new int[10];
	}

	public static void printLength(int seq, int... numArray) {
		System.out.println ("Array length of sequence: " + seq + " => " + numArray.length);
	}

	public static void main(String[] args) {
		//What happens to a instance array variable? to what it gets initialised?

		DemoArray d = new DemoArray();

		for(int i=0; i < d.numArray.length; i++) {
			System.out.println(i + ": " + d.numArray[i]);
		}

		//If the strArray was initlised, null pointer exception is thrown at runtime		
		/*for(int i=0; i < d.strArray.length; i++) {
			System.out.println(i + ": " + d.strArray[i]);
		}*/

		//We can conclude that the array variable too is similar to reference variable and initilised to null by default,
		//What about local array variable?

		//These are valid ways of declaring a array variable
		int[] localNumArray1; //This is the most preferred as it says the type of array along with its type
		int [] localNumArray2;
		int localNumArray3[];
		int localNumArray4 [];

		int nonArrayVar, numArrayVar[]; //just by moving the brackets, we create on simple var and another array type of variable of data type int
		//System.out.println("nonArrayVar " + nonArrayVar); //throws unintilised exception
		//System.out.println("numArrayVar " + numArrayVar); //throws unintilised exception

		//Trying to print the local array variable of premitive data type
		//If the local array variable is not initlised, compilation fails 
		/*for(int i=0; i < localNumArray.length; i++) {
			System.out.println(i + ": " + localNumArray[i]);
		}*/

		int[] anonymousArray = {1, 2, 3, 4, 5};
		int[][] anonymous2DArray = { {1, 2}, {3, 4}, {5, 0}};

		//You can print array using this utility
		System.out.println(java.util.Arrays.toString(anonymousArray));

		System.out.println("2D Array looping");
		for(int i=0; i < anonymous2DArray.length; i++) {

			for(int j=0; j < anonymous2DArray[i].length; j++) {
				System.out.println("{" + i + ", " + j + "} : " + anonymous2DArray[i][j]);
			}
		}

		System.out.println("2D array looping simpler way");
		//The same looping, can be looped in simpler way like below, however it will loose the index capability (i.e, i & j cannot be known)
		for(int[] inner : anonymous2DArray) {
			for (int num : inner)
				//Cannot print this statement, though can access the array element easily
				//System.out.println("{" + i + ", " + j + "} : " + num);
				System.out.print(num + "\t");
		}
		System.out.println("\n ~ end of 2D array simple loop ~");

		System.out.println("Printing 2D Array using util method"); 
		//This will not work, as util method only be able to loop for single dimension, hence this will print a reference value instance of printing values of array elements
		System.out.println(java.util.Arrays.toString(anonymous2DArray));

		//Length is the slots available in array, its not guarnteed to be initlised or occupaid by a value
		System.out.println("2D Array length: " + anonymous2DArray.length);

		//Array type variable initlisation follow same as any other reference variables 

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); // Compile time error: incompatible types: StringBuilder cannot be converted to String
		//objects[0] = new StringBuilder(); // Runtime error java.lang.ArrayStoreException

		String[] strNumArray = { "10", "9", "100" }; 
		java.util.Arrays.sort(strNumArray);

		//This is one more easy way to loop an array, in case you don't need array index while looping
		for (String string : strNumArray)
			System.out.println("\t " + string + " "); //Remember string is keyword but case is not same here, hence this is a valid variable


		//Is this valid int array declaration and initilisation?
		//int numbers = new int[] {3,2,1}; //this will be a compiler error
		int[] numbers = new int[] {3,2,1};
		System.out.println ("Going to find in array : " + java.util.Arrays.toString(numbers));


		//How array elements behave when they are set in different functions and how they will be garbage collected?
		String[] myTravellingArray = new String[6];
		d.fill3Element(myTravellingArray);
		d.fillNext3Element(myTravellingArray);

		System.out.println ("Printing travelling array initilised from different functions : " + java.util.Arrays.toString(myTravellingArray));


		//Asymmetric multidimensional array
		//there are 2 easy ways to declare and initlise asymmetric arrays

		//Method 1 of declaring a asymmetric array
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};

		//Method 2 of declaring asymmetric array 
		int[][] twoD = new int[4][]; //note only one dimension of the array was specified for initialising
		twoD[0] = new int[5];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		//twoD[3] = {100, 10, 1000, 10000}; //Does not compile
		int[] inner2D = {100, 10, 1000, 10000};
		twoD[3] = inner2D;


		Object[][][] cubbies = new Object[3][0][5];
		java.util.Date[] dates[] = new java.util.Date[2][];

		//This is invalid array declarate
		//int[][] types = new int[];

		char[]c = new char[2];
		int length = 0;
		//length = c.capacity;
		//length = c.capacity();
		length = c.length;
		//length = c.length();
		//length = c.size;
		//length = c.size();

		ArrayList l = new ArrayList();		
		//length = l.capacity;
		//length = l.capacity();
		//length = l.length;
		//length = l.length();
		//length = l.size;
		length = l.size();

		/*
		ArrayList aList = new ArrayList();
		aList.remove(0); //This will give run time exception as no element in it and hence index out of bound exception 
		*/

		List<String> list = new ArrayList<String>(); 
		list.add("one");
		list.add("two");
		//list.add(7); //This will not compile due to type mismatch and hence java will not find any suitable method to compile
		
		for(String s : list) 
			System.out.println(s);

		ArrayList<Integer> values = new ArrayList<>(); 
		values.add(4);
		values.add(5);
		//values.set(1, 6);
		values.remove(0);
		for (Integer v : values) {
			System.out.println("-> " + v);
		}

		int[] random = { 6, -4, 12, 0, -10 }; 
		int x = 12;
		int y = Arrays.binarySearch(random, x); 
		System.out.println("Binary search result: " + y);

		List<Integer> listToSort = Arrays.asList(10, 4, -1, 5); 
		Collections.sort(listToSort);
		//Integer array[] = listToSort.toArray(new Integer[4]); 
		Integer array[] = listToSort.toArray(new Integer[listToSort.size()]);  //above line can also be rewritten like this
		System.out.println(array[0]);

		String [] names = {"Tom", "Dick", "Harry"}; 
		//List<String> list = names.asList(); 
		list.set(0, "Sue"); 
		System.out.println("Name array at 0 index: " + names[0]);


		//Var arrage invoking styles
		printLength(1);
		printLength(2, 2);
		printLength(3, 2, 3);
		printLength(4, new int[]{4, 5});
		printLength(4, null);

	}

	public void fill3Element(String[] travellingArray) {
		travellingArray[0] = "First";
		travellingArray[1] = new String("Second");
		travellingArray[2] = "Third";
	}

	public void fillNext3Element(String[] travellingArray) {
		String[] localStrArray = {"1", "2", "3", "Fourth"};
		travellingArray[3] = localStrArray[3];

		String fifth = "Fifth";
		travellingArray[4] = fifth;
		
		travellingArray[5] = " Sixth ".trim();;
	}

}
