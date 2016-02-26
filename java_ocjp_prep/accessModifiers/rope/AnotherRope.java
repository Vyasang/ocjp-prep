package rope;

public class AnotherRope {
	public static void swing() {
		System.out.print("swing "); 
	}

	public void climb() { 
		System.out.println("climb ");
	}

	public static void play() {
		swing();
		climb(); 
	}

	public static void main(String[] args) { 
		AnotherRope rope = new AnotherRope();
		rope.play();
		AnotherRope rope2 = null;
		rope2.play(); 
	}
}