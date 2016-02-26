import rope.*;

import static rope.Rope.*; //this will import all static public variables from Rope class as if it is local to Chimp and any other classess declared here

public class Chimp {
	public static void main(String[] args) { 
		Rope.swing();
		new Rope().swing(); 
		System.out.println(LENGTH);
		//System.out.println(SHORT_LENGTH);
	} 
}

class SmallChimp {
	public static void main(String[] args) { 
		System.out.println(SHORT_LENGTH);
	} 
}