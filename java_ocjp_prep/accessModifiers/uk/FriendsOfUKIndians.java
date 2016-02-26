package uk;

class FriendsOfUKIndians {
	public static void main(String[] args) {
		UKIndians ukIndians = new UKIndians();

		//Accessing from a same class
		System.out.println("** Accessing from a class in same package of class which extends its parent from another package **");
		//System.out.println("ID : " + ukIndians.id);
		//System.out.println("code : " + ukIndians.code);
		System.out.println("name : " + ukIndians.name);
		//System.out.println("longName : " + ukIndians.longName);
		//System.out.println("longName : " + ukIndians.domain);
		System.out.println("currency : " + UKIndians.currency);
	}
}