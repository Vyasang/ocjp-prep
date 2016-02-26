class BaseClass {
	public void method(int param) throws IllegalArgumentException {

	}
}

class ChildClass extends BaseClass {
	public void method(int param) throws IllegalArgumentException, ArrayIndexOutOfBoundsException {

	}
}

class BaseProvider {
	public void provide() throws Exception {

	}

	protected static Integer chew() throws Exception { 
		System.out.println("Rodent is chewing");
		return 1;
	}
}

class ConcreteProvider extends BaseProvider {
	public void provide() throws RuntimeException {

	}

	public Number chew() throws RuntimeException {
		System.out.println("Beaver is chewing on wood");
		return 2; 
	}
}

class ExceptionsInOverridingDemo {
	public static void main(String[] args) {
		new ConcreteProvider();
	}
}