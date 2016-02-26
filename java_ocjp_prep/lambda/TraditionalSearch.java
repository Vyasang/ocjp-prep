import java.util.List;
import java.util.ArrayList;
import java.util.function.*;

class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName; canHop = hopper; canSwim = swimmer;
	}
	
	public boolean canHop() { 
		return canHop; 
	} 

	public boolean canSwim() { 
		return canSwim; 
	} 

	public String toString() { 
		return species; 
	}
}

interface CheckTrait { 
	boolean test(Animal a);

	//For use with lambda function, a interface should have only one function defined in it
	//these are called functional interfaces, hence only one method is allower per interface, 
	//if added one more method as below, you get compile error incompatible types: CheckTrait is not a functional interface
	//boolean testAnother(Animal a);
}

class CheckIfHopper implements CheckTrait { 
	
	public boolean test(Animal a) {
		return a.canHop(); 
	}

	public boolean testAnother(Animal a) {
		return true;
	}
}

class CheckIfSwimmer implements CheckTrait { 
	//Interface implementation method has to be public
	public boolean test(Animal a) {
		return a.canSwim(); 
	}


	public boolean testAnother(Animal a) {
		return true;
	}
}

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals animals.add(new Animal("fish", false, true));
		
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		animals.add(new Animal("elephant", false, false));
		
		/*
		// this is how you can do without lambda function		
		
		// pass class that does check 		
		System.out.println("Hoppers");
		print(animals, new CheckIfHopper()); 

		System.out.println("Swimmers");
		print(animals, new CheckIfSwimmer()); 
		*/

		System.out.println("Hoppers");
		print(animals, a -> a.canHop());

		System.out.println("Swimmers");
		print(animals, a -> a.canSwim());

		System.out.println("Animals which cannot Swimm");
		//print(animals, a ->  ! a.canSwim());
		//print(animals, (Animal a) ->  { System.out.print("\t-"); return ! a.canSwim(); } ); //same lambda expression can also be re-written like this (i prefer this way even if its a single line lambda)

		//same lamda instead of using the functional interface, will use a Predicate
		printUsingPredicate(animals, (Animal a) ->  { return ! a.canSwim(); } );
	}
	
	private static void print(List<Animal> animals, CheckTrait checker) { 
		for (Animal animal : animals) {
			if (checker.test(animal)) 
				System.out.println("\t" + animal + " ");
		}
		System.out.println(); 
	}

	private static void printUsingPredicate(List<Animal> animals, Predicate<Animal> checker) { 
		for (Animal animal : animals) {
			if (checker.test(animal)) 
				System.out.println("\t" + animal + " ");
		}
		System.out.println(); 
	}
}