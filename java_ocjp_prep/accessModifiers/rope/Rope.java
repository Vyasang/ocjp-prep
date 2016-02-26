package rope; 

public class Rope {
	public static int LENGTH = 5; 
	public static int SHORT_LENGTH = 5; 
	static {
		LENGTH = 10; 
	}

	public static void swing() { 
		System.out.print("swing "); 
	}
}