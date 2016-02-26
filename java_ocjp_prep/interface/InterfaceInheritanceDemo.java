//What is the use of the interfaces inheritance? really feel no use unless it is incrmental 

interface BaseInterface {
	//though not specified as static, JAVA assumes it as static and public
	int HONEY = 1;

	//Cannot declare a static method without providing defintion or the method body
	//public static void eatGrass();

	//public static final int MONEY; //does not work, initialisation is necessary
	public static final int MONEY = 1;

	//Static initialiser is not valid for interfaces
	/*static {
		MONEY = 1;
	}*/
	
	//This is a default method delcaration in interface, introduced in Java 8.0
	public default double getCurrencyRate() {
		return 1.0;
	}
}

interface UpStreamInterface extends BaseInterface{
	public abstract void showTheMoney();

	//Overriding 
	public default double getCurrencyRate() {
		return 0.5;
	}
}

//Can extend multiple interfaces 
interface ChildInterface extends UpStreamInterface, BaseInterface {
	public abstract void countTheMoney();
}

interface TheInterface extends BaseInterface, UpStreamInterface, ChildInterface {
	public abstract void countTheMoney(double d); //this is perfect to be implemented by the concrete class
	//public abstract int showTheMoney(); //this will not work as return type is different from 
}

interface DifferentInterface {
	public default double getCurrencyRate() {
		return 0;
	}

	public static double getMultiplier () {
		return 1.5;
	}
}

abstract class TestInterfaceChild implements BaseInterface, UpStreamInterface, ChildInterface, TheInterface {	

}

//class Implementor extends TestInterfaceChild implements TheInterface {
class Implementor extends TestInterfaceChild implements TheInterface, BaseInterface, UpStreamInterface, ChildInterface, DifferentInterface { //Can implement from as many interface required
	private double money;

	public void showTheMoney() {
		System.out.println("Showing the money..!");
	}

	public void countTheMoney() {
		System.out.println("Counting the money..!");
	}

	public void countTheMoney(double d) {
		money += getCurrencyRate() * d; //this staement makes use of the default interface method
		System.out.println("Counted money: " + money);
	}

	//If below method is removed, ambiguity with DifferentInterface will arise as its unrelated to rest of the interfaces which the class is implementing
	//and also implements one of the default method which other interfaces too are implementing
	//The ambiguity is avoided by the Implementor by providing latest definition to the method (default interface method)
	public double getCurrencyRate() {
		//static methods from interfaces have to be referenced with the interface name
		//This is because static methods are not inherited from interface to class implementing it unlike in case of Classes inheritance
		return DifferentInterface.getMultiplier(); 
	}
}

class InterfaceInheritanceDemo {
	public static void main(String[] args) {
		System.out.println("Money: " + BaseInterface.MONEY);

		TestInterfaceChild impl = new Implementor();
		impl.showTheMoney();
		impl.countTheMoney();
		impl.countTheMoney(4.0);

		//can we invoke the static methods from default interfaces?
		//YES
		System.out.println("Default multiplier: " + DifferentInterface.getMultiplier());

	}
}