import rope.*;

import static rope.ConstantRope.*; 

public class ConstantRopeSwing {
	private static ConstantRope rope1 = new ConstantRope(); 
	private static ConstantRope rope2 = new ConstantRope(); 

	{
		System.out.println(rope1.length); 
	}

	public static void main(String[] args) { 
		rope1.length = 2;
		rope2.length = 8; 
		System.out.println(rope1.length);
	} 
}