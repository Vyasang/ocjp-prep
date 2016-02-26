abstract class NotSoGoodClass {
	private void someMethod() { System.out.println("Some not so good method"); }

	public static void main(String[] args) {
		NotSoGoodClass n = new NotVeryGoodClass();
		n.someMethod();
	}
}

class NotVeryGoodClass extends NotSoGoodClass {
	protected void someMethod() { System.out.println("Some Not very Good method"); }
}

class HidingMethodsDemo {

	//This will give error as somemethod in reference to NotSoGoodClass is private
	//Thats why if we push the main method inside the NotSoGoodClass, then it works as there private is acceissible 
	/*public static void main(String[] args) {
		NotSoGoodClass n = new NotVeryGoodClass();
		n.someMethod();
	}*/

	//This will invoke the main of the NotSoGoodClass
	public static void main(String[] args) {
		NotSoGoodClass.main(args);
	}
}