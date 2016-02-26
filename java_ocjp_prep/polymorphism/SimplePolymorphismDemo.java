class Nehru {

}

class Indira extends Nehru {

}

class Rajiv extends Indira {

}

class Rahul extends Rajiv {

}

class SimplePolymorphismDemo {
	public static void main(String[] args) {
		Rahul r = new Rahul();

		Nehru n = r;

		Rajiv rj = (Rajiv) n;

	}
}