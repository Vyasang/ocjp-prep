
interface Secret {
	String magic(double d);
}

public class MySecret implements Secret { 
	
	public String magic(double d) {
		return "Poof"; 
	}
}