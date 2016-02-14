package employee;

//This will work
import aquarium.*;

//This will work
/*
import aquarium.Water; //resolved to based on precedence as complete qualified path of class is provided
import aquarium.jellies.*;
*/

/*
//This will work
import aquarium.*;
import aquarium.jellies.Water; //resolved to based on precedence as complete qualified path of class is provided
*/

/*
//This will create conflict
import aquarium.*;
import aquarium.jellies.*;
*/

/*
//This will create conflict
import aquarium.Water;
import aquarium.jellies.Water;
*/


public class WaterFiller {
	Water water = new Water();
	
	{ System.out.println (water); }

	public static void main(String[] args) {

		WaterFiller filler = new WaterFiller();

		System.out.println("works");
		
	}
}