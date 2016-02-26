//Does interfaces too inherited from Object class?

//public  //if the interface is declared public, it should be saved in a sperate file with same name as the interface name
//abstract interface SimpleInterface { //this is a valid definition

interface SimpleInterface {
	//final void display(); //interface methods cannot be final, else how will they be implemented?
	

	//abstract void display(); this is a valid definition
 	//void display();
 	public void display(); //this is a good practice
}

//final interface AnotherSimpleInterface { //Final keyword on a interface is illegal & invalid
interface AnotherSimpleInterface {
	default void display() {
		System.out.println("The default is displayed");
	}
}

//This is a valid interface
interface EmptyInterface {}

class OtherImpl {
	/*public void display() {
		System.out.println("Display from other implementation class...!");
	}*/
}

//Even though a method may be defined same way in more than one interface from which class is being implemented, only one definition of the method will be fine
class SimpleInterfaceImpl extends OtherImpl implements SimpleInterface, AnotherSimpleInterface
		//, EmptyInterface //you can implement a empty interface and provide no method in the concrete class
{

	//This will create compile error, as by default in interface public is assumed as the access modifier
	//Hence in class when being implemented, if left alone it become package private, which is weaker than public 
	//Error: attempting to assign weaker access privileges; was public
	//void display() {

	public void display() {
		System.out.println("Display completed..!");
	}

	/*public void display() {
		AnotherSimpleInterface.display();
	}*/

	//Override & Inheritence still work normal for imterface implementation too
	//i.e., if extended class provides exact same method definition, even though it may not be implementing it from the interface, it will still work
	//same way if the methods are defined in both implementing class and parent class the overriden method will be used
}

class SimpleInterfaceDemo {
	public static void main(String[] args) {
		SimpleInterface si = new SimpleInterfaceImpl();
		si.display();
	}
}