class MyUselessException extends Exception {}

class ExceptionsTest {

	public void simpleMethod() throws MyUselessException {

	}

	public void tryCheckedException() throws java.io.IOException {
		//throw new java.io.IOException();
	}

	//This method not declaring the type of the exception it throws
	//As this is a unchecked exception, JAVA does not require method to declare the exception 
	//Even if we declare there is no effect of it
	//public void tryUncheckedException() throws ArithmeticException {
	public void tryUncheckedException() {
		//throw new ArithmeticException();
	}

	public void tryOnlyFinally() {
		//Finally alone is enough
		//However inside try if there is a explicit throw statement then catch is mandatory
		System.out.println("Started");
		try {
			System.out.println("Inside try");
			//throw new Exception();
		} finally {
			System.out.println("Finally done");
		}

		System.out.println("Completed");
	}

	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
					result += "before";
					v.length();
					result += "after";
				} catch (NullPointerException e) {
					result += "catch";
					throw new RuntimeException();
				}  finally {
					result += "finally"; 
					throw new Exception();
				}
		} catch (Exception e) {
			result += "done"; 
		}
		return result; 
	}

	//Example to produce a Error of type java.lang.ExceptionInInitializerError
	/*static {
		int[] countsOfMoose = new int[3]; 
		int num = countsOfMoose[-1]; //Array index out of bound in a static initialiser
	}*/
}


class ExceptionsDemo {
	//This below line works, even main can declare a exception to be thrown
	//public static void main(String[] args) throws java.io.IOException {
	public static void main(String[] args) {
		ExceptionsTest demo = new ExceptionsTest();

		try {
			demo.simpleMethod();
		} catch(MyUselessException e) {

		}

		//As this method throws a checked exception, without handling it code cannot be compiled
		//or we have to mention it as throws 
		//demo.tryCheckedException();

		demo.tryUncheckedException();

		demo.tryOnlyFinally();

		System.out.println(demo.exceptions());
	}
}