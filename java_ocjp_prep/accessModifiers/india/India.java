package india;

public class India {
	private int id = 91;
	
	//default package private
	String code = "IN";

	protected String longName = "Republic of India";

	public String name = "India";

	public static String currency = "Rupee (Rs.)";

	public static String longitude;
	public static String latitude; 

	static  {
		
		//longitude = "12";
		//latitude = "77";

		//Static initialisers are used, when initlisation of static variables require more than one line of code 
		//I think better is to put that into a private static method and call it from the static initialiser 
		initialiseStatics();
	}

	private static void initialiseStatics() {
		longitude = "12";
		latitude = "77";
	}

	//India() {} //this will hide the constructor from classes outside the package
	public India() {}


	void println() {
		//Accessing from a same class
		System.out.println("** Accessing from a same class **");
		System.out.println("ID : " + id);
		System.out.println("code : " + code);
		System.out.println("name : " + name);
		System.out.println("longName : " + longName);
		System.out.println("currency : " + currency);
		
		System.out.println("longitude : " + longitude);
		System.out.println("latitude : " + latitude);
	}

	public static void main(String[] args) {
		India india = new India();

		//Accessing from a same class
		/*System.out.println("** Accessing from a same class **");
		System.out.println("ID : " + india.id);
		System.out.println("code : " + india.code);
		System.out.println("name : " + india.name);
		System.out.println("longName : " + india.longName);
		System.out.println("currency : " + India.currency);*/

		india.println();
	}
}