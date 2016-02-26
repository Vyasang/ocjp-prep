class StringDemo {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1;

		System.out.println("S1 " + s1);
		System.out.println("S2 " + s2);
		System.out.println("S3 " + s3);

		int num = 4;
		String str = "" + num + 1; //this will not comile at least one string value should be there in the expression to concatinate
		String flowers = "flowers";
		System.out.println(str + " " + flowers);
		System.out.println(num + " " + 1);

		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s)) System.out.println("one");
		if (t == s) System.out.println("two");
		if (t.equals(s)) System.out.println("three"); 
		if ("Hello" == s) System.out.println("four"); 
		if ("Hello" == t) System.out.println("five");

		StringBuilder sb = new StringBuilder(); 
		sb.append("aaa").insert(1, "bb").insert(4, "ccc"); 
		System.out.println(sb);

		String str1 = "java";
		StringBuilder str2 = new StringBuilder("java"); 

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//This will not compile as incompatible types are being compared
		/*if (str1 == str2)
			System.out.print("1"); */
		
		//equals methods usually accept object and type as same as their class, hence StrinbBuilder object got passed as Object and compiles but runtime does not work as expected
		if (str1.equals(str2))
			System.out.println("2");
		else 
			System.out.println("! 2");

		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar"); 

		//Passing strings to method, where changes may be applied to these
		new StringDemo().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2);

		String letters = "abcdef"; 
		System.out.println(letters.length());
		System.out.println(letters.charAt(3)); 
		//System.out.println(letters.charAt(6)); //this will throw java.lang.StringIndexOutOfBoundsException as index is out of reach

		String numbers = "012345678"; 
		System.out.println("~"); 
		System.out.println(numbers.substring(1, 3)); 
		System.out.println(numbers.substring(7, 7)); 
		System.out.println(numbers.substring(7));
		System.out.println("~");


		String strTest = "purr";
		strTest.toUpperCase();
		strTest.trim();
		strTest.substring(1, 3);
		strTest += " two";
		System.out.println(strTest.length());


		String a = "";
		//In the next 3 lines, as at least one string is in the expression (+= translate to 'a = a +') this will work
		a += 2;
		a += 'c';
		a += false;
		if ( a == "2cfalse") System.out.println("==");
		if ( a.equals("2cfalse")) System.out.println("equals");

		int total = 0;
		StringBuilder letterStr = new StringBuilder("abcdefg");
		total += letterStr.substring(1, 2).length();
		total += letterStr.substring(6, 6).length();
		//total += letterStr.substring(6, 5).length(); this will throw runtime exception as ending index is invalid
		System.out.println(total);

		StringBuilder numbers1 = new StringBuilder("0123456789"); 
		numbers1.delete(2, 8);
		numbers1.append("-").insert(2, "+"); 
		System.out.println(numbers1);

		StringBuilder b = new StringBuilder("rumble"); 
		//StringBuilder b = "rumble"; 
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1); //rumble4 //rumle4 //rum4
		System.out.println(b);

		StringBuilder puzzle = new StringBuilder("Java");
		puzzle.reverse();	
		System.out.println(puzzle);
	}

	public void roar(String roar1, StringBuilder roar2) { 
		roar1.concat("!!!"); //This will not change the original value of roar1 as string is immutable
		roar2.append("!!!"); //As StringBuilder is mutable, this will make the change to original class
	}
}