
abstract class Animal {

}

//abstract final class Whale {  //This line will not compile as an abstract class cannot be declared as final
//Even abstract classes can inherit from other classes , espeically a Abstract class
abstract class Whale extends Animal { 
	//A abstract method cannot be private as that would cause child class to loose visibility to the method and unable to override, which defeats the purpose of the abstract class
	//private abstract void sing();
	abstract void sing();
}

class HumpbackWhale extends Whale { 
	protected void sing() { 
		System.out.println("Humpback whale is singing"); 
	}
}

abstract class Level1 {
	abstract void getLevelId();
	abstract void getLevelName();
}

abstract class Level2 extends Level1 {
	void getLevelId() {
		System.out.println("NL-001");
	}
	
	abstract void getLevelName();
}

abstract class Level3 extends Level2 {
	void getLevelName() {
		System.out.println("Next Level");
	}
}

//The concrete class is not implementing any method as subsequent abstract classes which are extended from the grand abstract parent have given the implementaiton
class NextLevel extends Level3 {
	//Can override 
	/*void getLevelName() {
		System.out.println("Final Level");
	}*/
}

public class OverridingAbstracts {
	public static void main(String[] args) {
		Whale w = new HumpbackWhale();
		w.sing();

		NextLevel l1 = new NextLevel();
		l1.getLevelId();
		l1.getLevelName();
	}	
}

