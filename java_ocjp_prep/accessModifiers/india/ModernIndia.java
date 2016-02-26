package india;

public class ModernIndia extends India {
	protected String domain = "." + code.toLowerCase();

	public static void main(String[] args) {
		ModernIndia modernIndia = new ModernIndia();

		//Accessing from a same class
		System.out.println("** Accessing from a child class **");
		//System.out.println("ID : " + modernIndia.id);
		System.out.println("code : " + modernIndia.code);
		System.out.println("name : " + modernIndia.name);
		System.out.println("longName : " + modernIndia.longName);
		System.out.println("longName : " + modernIndia.domain);
		System.out.println("currency : " + ModernIndia.currency);
	}
	
}