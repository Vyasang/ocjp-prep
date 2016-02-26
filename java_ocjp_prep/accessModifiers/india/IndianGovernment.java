package india;

class IndianGovernment {
	public static void main(String[] args) {
		India india = new India();

		//Accessing from a same package
		System.out.println("** Accessing from a same package but different class **");
		//System.out.println("ID : " + india.id); //Cannot access private variable from any where except same class
		System.out.println("code : " + india.code);
		System.out.println("name : " + india.name);
		System.out.println("longName : " + india.longName);
		System.out.println("currency : " + India.currency);
	}
}