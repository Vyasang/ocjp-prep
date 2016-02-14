
interface HasTail { int getTailLength(); }

//What is the expected output of this program
abstract class Puma implements HasTail {
	//Hiding the interface method, this will be a compilation error
	protected int getTailLength() {return 4;}
}

public class Cougar extends Puma {
	public static void main(String[] args) { 
		//Cannot instantiate a abstract class object, this too will be a compilation error
		Puma puma = new Puma(); 
		System.out.println(puma.getTailLength());
	}
	
	public int getTailLength(int length) {
		return 2;
	}
}
