import java.util.List;
import java.util.ArrayList;

public class WrappersDemo {
	public static void main(String[] args) {
		int i = Integer.parseInt("2222");
		Integer intgr = Integer.valueOf("2222");

		if(intgr.equals(i)) {
			System.out.println(intgr);
		}

		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(1); //Autoboxing
		numbers.add(2); //Autoboxing
		//don't mistake this to remove the element whose value is 1, instead this will remove the element at index 1, 
		//this is the problem with autoboxing, as there are two overloaded methods
		//List.remove(Object) & List.remove(int index)
		//The autoboxing will automatically use remove(int) and skips autoboxing
		numbers.remove(1); 

		//numbers.remove(new Integer(1)); 
		System.out.println(numbers); //unboxing
	}
}