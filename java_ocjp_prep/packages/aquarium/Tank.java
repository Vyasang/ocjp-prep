package aquarium;

//These below can be avoided as lang is imported by default
//both tank and water are in the same package

/*import java.lang.*; 
import java.lang.System; 
import aquarium.Water; 
import aquarium.*; 
*/
public class Tank {
	public void print(Water water) { 
		System.out.	println(water); 
	} 

	public static void main(String[] args) {
		Tank t = new Tank();
		t.print(new Water());
	}
}
