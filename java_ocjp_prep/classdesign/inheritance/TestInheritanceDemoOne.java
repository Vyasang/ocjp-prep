
abstract class Bird {
	//this will make the pelican override the method
	//protected void fly() { 

	//This will only change the access modifier and will not override
	private void fly() { 
		System.out.println("Bird is flying "); 
	}

	public static void main(String[] args) {
		Bird bird = new Pelican();
		bird.fly();

		Pelican pelican = new Pelican();
		pelican.fly();
	}
}

class Pelican extends Bird {
	protected void fly() { 
		System.out.println("Pelican is flying "); 
	}
}