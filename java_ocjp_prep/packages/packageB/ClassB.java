package packageB; 

//This will give compilation error if ClassA is not available in package or is not declared as public
import packageA.ClassA; 

class ClassB {
	public void ClassB() {

	}
	
	public static void main(String[] args) { 
		//If import line has failed then this line too will fail as this symbol will be unrecognised without successful import
		ClassA a;

		//If import is successful and class is visible or accessible, this line will be printed
		System.out.println("Got it");
	} 
}