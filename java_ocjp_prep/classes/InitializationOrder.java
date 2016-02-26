
/*

Order of initialisation of class members

1. Super class initialisation
2. Static variables and Statid initialiser
3. Instance variables and Instance initialiser
4. Constructor
*/

class InitializationOrderSimple {
	private String name = "Torchie";

	{ 
		System.out.println(name); 
	}

	{
		System.out.println("Second instance initialiser");
	}
	
	private static int COUNT = 0;

	static { 
		System.out.println(COUNT); 
	}

	static { 
		COUNT += 10; 
		System.out.println(COUNT); 
	} 

	public InitializationOrderSimple() {
		System.out.println("constructor"); 
	} 
}

class InitializationOrder { 

	public static void main(String[] args) {
		System.out.println("In Main method");
		//InitializationOrderSimple init = new InitializationOrderSimple();
		new InitializationOrderSimple();
	}
}