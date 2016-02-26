package india.karnataka;

import india.India;

class Karnataka {
	public static void main(String[] args) {
		India india = new India();

		//Accessing from a sub package
		System.out.println("** Accessing from sub package class **");
		//System.out.println("ID : " + india.id);
		//System.out.println("code : " + india.code);
		System.out.println("name : " + india.name);
		//System.out.println("longName : " + india.longName);
		System.out.println("currency : " + India.currency);
	}
}