//public 
class YetMoreInitializationOrder {
	static {
	 	add(2); 
	}
	
	static void add(int num) { 
		System.out.println(num + " "); 
	}

	YetMoreInitializationOrder() { add(5); }
	
	static { 
		add(4); 
	}

	{ 
		add(6); 
	}
	
	static { 
		System.out.println("So am i called first?");
		new YetMoreInitializationOrder(); 
	}

	{ 
		add(8); 
	}

	public static void main(String[] args) { 
		System.out.println("when did i got called?");//nothing to do
	} 
}

/*class MyMain {
	public static void main(String[] args) { 
		System.out.println("so now class will not even be initialised?");//nothing to do
	}	
}*/

/*

In this example main method is in the same class and main method does nothing, then how this code works?
JRE calls the main method something like YetMoreInitializationOrder.main(); 

Which makes the static part of the class to be initialised first, on the way to initialise the static part of the class, 
we encounter a line#23 which instantiates the object of the class 
Thus the instance initilisers and constructors too are called 

Hence what is printed are first static and then instance and then constuctor 

*/
