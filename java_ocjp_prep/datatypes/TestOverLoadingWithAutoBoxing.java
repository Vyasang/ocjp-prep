public class TestOverLoadingWithAutoBoxing {

	public void print(byte x) {
		System.out.print("byte"); 
	}
	
	public void print(int x) { 
		System.out.print("int");
	}
	
	public void print(float x) {
		System.out.print("float");
	}
	
	public void print(Object x) {
		System.out.print("Object");
	}
	
	public static void main(String[] args) {
		TestOverLoadingWithAutoBoxing t = new TestOverLoadingWithAutoBoxing();
		short s = 123;
	 	t.print(s);
	 	t.print(true);
	 	t.print(6.789); //This will call object as JAVA will not automatically map to fload
	 	t.print(6.789f); //This will call float, as digit end with 'f' indicating JaVA it should be treated as float
	 	System.out.println();
	}
}