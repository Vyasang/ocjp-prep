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

		String java.lang = "Basavaraj";
		System.out.println(java.lang);

	}
}

class Test {
	public void Test() {
	SampleClass c = new SampleClass();
		//You can see from below you can access a instance variable directly to get the value even from another class
		System.out.println(c.id);
	}
}