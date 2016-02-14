class VariableNmes {
	
	//Notice the argument name is main and jvm does not complain at all about it, its fine 
	public static void main(String[] main) {		
		_C c = new _C();
		c.testme();	
	}
}

//The class name is starting with underscore '_' and still its valid
class _C {
	//This is a special character and still valid
	private static int $;

	//If this variable is initlised as instance variable, default value is initlised, but not if same is declared as a local variable
	//private String a_b;

	public void testme() {
		//You canot do this, as String is a class and hence a_b is a class object, which has to be initlised, only premitive variable types gets initlised in this case $ is initlised but not a_b
		//As this is a local variable, value will not be initlised by default, it is only done for instance & class variables 
		String a_b;

		System.out.println("This is a valid variable " + $);
		System.out.println("This is a valid string variable " + a_b);

		//No matter how many times a local uninitlised variable is used the error was shown only once
		System.out.println("this " + a_b + " ");
	}
}