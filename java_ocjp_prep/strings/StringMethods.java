class StringMethods {
	public static void main(String[] args) {
		String s = "basavaraj";
		//b a s a v a r a j
		//0 1 2 3 4 5 6 7 8

		//Stops at 8th char, i.e., it will not include 8th char
		String subStr = s.substring(2, 8); 
		//You can easily know the total number characters in the resulting substring by deducting starting index value with endat index value
		//i.e., in above case, 8-2 = 6 chars so simply count that many characters starting from 2nd index to know which characters will be returned in the substring

		System.out.println(s.toUpperCase());

		System.out.println(s.replace('a', 'i'));
		System.out.println(s.replace("raj", ""));


		System.out.println(" case sensitive equals " + s.equals(s.toUpperCase()));
		System.out.println(" case IN-sensitive equals " +  s.equalsIgnoreCase(s.toUpperCase()));

		System.out.println("[" + "    this has lot of white spaces              ".trim() + "]");
		System.out.println("\t a b c\n".trim()); // a b c

		System.out.println(subStr);

		System.out.println(s.substring(s.indexOf('r')));
		System.out.println(s.substring(3, 4));
		

		//Should throw exception at run time, not at compile time (java.lang.StringIndexOutOfBoundsException)
		//System.out.println(s.substring(7, 3));
		
		//This too should throw a run time exception as index will be out of range (java.lang.StringIndexOutOfBoundsException)
		System.out.println(s.substring(3, (s.length()+1)));
	}
}