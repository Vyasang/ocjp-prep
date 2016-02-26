class SimpleClass {
	public SimpleClass(int arg) {
		System.out.println("Simple class");
	}
}

class ChildOfSimpleClass extends SimpleClass {
	public ChildOfSimpleClass() {
		System.out.println("Child of Simple class");
	}	
}

class ConstructorOerrideDemo {
	public static void main(String[] args) {
		//new SimpleClass(10);
		//new ChildOfSimpleClass();
	}
}