public class InitializationOrderMainMethodInSameClass {
	private String name = "Torchie";
	
	{ 
		System.out.println(name); 
	}
	
	private static int COUNT = 0;
	
	static { 
		System.out.println(COUNT); //prints 0
	}

	{ 
		COUNT++; 
		System.out.println(COUNT); 
	} 

	public InitializationOrderMainMethodInSameClass() {
		System.out.println("constructor"); 
	}
	
	public static void main(String[] args) { 
		System.out.println("read to construct"); 
		new InitializationOrderMainMethodInSameClass();
	} 
}