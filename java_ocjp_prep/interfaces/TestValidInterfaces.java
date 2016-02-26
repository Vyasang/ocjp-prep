interface Herbivore {
	int amount = 10;
	//public static void eatGrass(); 
	public void eatGrass(); 
	/*public int chew() {
		return 13; 
	}*/
}

interface HasWings {
	public static final String TEST = "TEST";
	public abstract Object getWindSpan();
}

interface Nocturnal {
	default boolean isBlind() { 
		return true; 
	}
}

class Owl implements Nocturnal {
	public boolean isBlind() { 
		return false; 
	} 

	public static void main(String[] args) { 
		Nocturnal nocturnal = (Nocturnal)new Owl(); 
		System.out.println(nocturnal.isBlind());
	}
}

interface HasVocalCords {
	public abstract void makeSound();
}

interface CanBark extends HasVocalCords {
	public void bark(); 
}