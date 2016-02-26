public class SampleClass {

	protected int id=10;

	//This is not a constructor method as there is a return type
	//Hence this is a simple method with same name as the class and this is valid method
	//This works and easy to get confused for constructor but pay attention
	public void SampleClass() {
		System.out.println("I am not a constructor but my name is same as my class Name ");
	}

	public static void main(String[] args) {
		/*SampleClass c = new SampleClass();

		//You can see from below you can access a instance variable directly to get the value from main method in the same class
		System.out.println(c.id);*/
		Test t = new Test();
		t.Test();

	}
}

class Test {
	public void Test() {
	SampleClass c = new SampleClass();
		//You can see from below you can access a instance variable directly to get the value even from another class
		System.out.println(c.id);
	}

	//Invalid way of declaring a method, the order of signature to declare & define a method has to be followed
	/*void final TestMe() {

	}*/

	//this is not a valid method definition as not all controll paths reach the return statement
	/*String walk6(int a) { 
		if (a == 4) 
			return ""; 		
	}*/

	Object TestDummyReturn() {
		//i can return any premetive and reference types from here 
		//All below return types are vald ....! 
		//return 0;
		//return 9L;
		//return "";
		//return new Test();
		//return new StringBuilder();
		return new java.util.ArrayList();
	}
}