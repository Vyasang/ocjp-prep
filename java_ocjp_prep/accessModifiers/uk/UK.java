package uk;

import india.India;

public class UK {
	public static void main(String[] args) {
		India india = new India();

		//Accessing from outside the package
		System.out.println("** Accessing from outside package **");

		//System.out.println("ID : " + india.id);
		//System.out.println("code : " + india.code);
		System.out.println("name : " + india.name);
		//System.out.println("longName : " + india.longName);
		System.out.println("currency : " + India.currency);
	}
}