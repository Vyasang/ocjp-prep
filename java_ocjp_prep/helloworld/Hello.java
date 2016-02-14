//package helloworld;
/*
If you provide a package name, you have to go back to parent folder and runt he code like below
$ cd helloworld/
$ javac Hello.java 
$ cd ..
$ java -cp . helloworld.Hello
Hello, new world!
$
*/

//package myworld;
/*
If you are going to name the packagename different from the foldername, below is how you run the code
$ cd helloworld/
$ javac Hello.java 
$ cd ..
$ ln -s helloworld myworld
$ ls -l
total 8
drwxr-xr-x  6 basavarajk  staff  204 Feb 11 13:09 helloworld
lrwxr-xr-x  1 basavarajk  staff   10 Feb 11 13:08 myworld -> helloworld
$ java -cp . myworld.Hello
Hello, new world!
$ 

If you want to run from same folder, where you have the code, you can try this trick below, :-) it world too

$ ln -s . ./myworld
$ ls -ltr 
total 32
-rw-r--r--  1 basavarajk  staff  1392 Feb 11 13:24 Hello.java
-rw-r--r--  1 basavarajk  staff   433 Feb 11 13:24 Hello_New.class
-rw-r--r--  1 basavarajk  staff   193 Feb 11 13:24 Hello.class
lrwxr-xr-x  1 basavarajk  staff     1 Feb 11 13:25 myworld -> .
$ java -cp . myworld.Hello
Hello, new world!
$ 

*/

//Simple helloworld
/*public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world");
	}
}
*/

/*public class Hello {
	public static void main(String[] args) {
		//System.out.println("Hello, world");
		Hello_New.main(args);
	}
	public Hello() {
		//String s[] = {""};
		Hello_New.main(new String[]{""});
	}
}*/


//Funky hello world to demonstrate even static methods are inherited, including main method
//Also note the class on which it is invoked to run are not public class, it did not change whether class is public or not
class Hello_New {
	//Notice if we change the return type to other than void, it compiles well but gives a run time exception
	//public static int main(String[] args) {

	//In this, removed the parameter of main, this will also not work, exact signature of main method is a must to run the program
	//public static void main() {

	public static void main(String[] args) {
		System.out.println("Hello, new world!");

		//If you try to access the array element without it being initlised or assigned with a value, will encounter java.lang.ArrayIndexOutOfBoundsException 
		/*System.out.println("0: " + args[0]);
		System.out.println("1: " + args[1]);
		System.out.println("2: " + args[2]);*/

		//return 0;
	}
}

//This also not worked, as file name and class name must match for a entry point
//class Hello_one extends Hello_New {

//We are extending the class which has the main method, this is possible 
//public class Hello extends Hello_New {
class Hello extends Hello_New {

}

//This is to check the size of Dummy.class file, which is a eg for size of an empty class
//Notice when you compile, each class defined in the same file will produce independent class files
//In this current example as of now we have 3 classes defined in same file and when you compile you will get 3 class files
class Dummy {

}

/*

As we are extending the main method, we can run/execute the code with both the class name, like below
$ javac Hello.java 
$ java Hello
Hello, new world!
$ java Hello_New
Hello, new world!
$ 

*/

//This did not worked
//Hello h = new Hello();

