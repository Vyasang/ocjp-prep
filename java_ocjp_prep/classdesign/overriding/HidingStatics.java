
class Bear {
	public static void eat() {
		System.out.println("Bear is eating"); 
	}
}


class Panda extends Bear { 
	
	//This will not compile as it will not hide the parent's static method if static keyword is removed from the method signature
	//public void eat() {
	public static void eat() {
		System.out.println("Panda bear is chewing"); 
	}
 }

class Marsupial {
	public static boolean isBiped() {
 		return false; 
 	}

 	public boolean isNonStaticBiped() {
 		return false;
 	}
 	
 	public void getMarsupialDescription() { 
 		System.out.println("Marsupial walks on two legs: ->" + isBiped() + "<- and nonstatic: ->" + isNonStaticBiped() + "<-");
 	} 
}
 
class Kangaroo extends Marsupial { 
	public static boolean isBiped() {
 		return true; 
 	}

 	public boolean isNonStaticBiped() {
 		return true;
 	}
 	
 	public void getKangarooDescription() { 
 		System.out.println("Kangaroo hops on two legs: ->" + isBiped() + "<- and nonstatic: ->" + isNonStaticBiped() + "<-");
 	}
}


class HidingStatics {
	public static void main(String[] args) { 
		//Panda.eat(); //eat method from panda is executed as parent's method is hidden by panda

		Bear b = new Panda();
		b.eat(); //eat method of Bear is exceuted as it is referenced from Bear object now, note in case of overriding Panda's eat method should have got executed but this is static hence method got hidden but not overriden

		//Note the two methods which have same body as their static counter part 
		//The non-static method is referenced even from parent class but when using static its always the corresponding class
		//The non-static method was overriden ad the run time hence even parent class calls the overriden method 
		Kangaroo joey = new Kangaroo(); 
		joey.getMarsupialDescription(); 
		joey.getKangarooDescription();
	}	
}