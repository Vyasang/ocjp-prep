
//What is the output of this program?
class Loop {
	public static void main(String[] args) {
		boolean keepgoing = true;

		int count = 0;

		int x = 3;

		while(count++ < 3) {
			int y = (1 + 2 * count) % 3;
			//System.out.println(count + ":" + x + ":" + y);
			switch(y) {
				case 0: x -= 1; break;
				case 1: x += 5;
			}
		}
		System.out.println(x);
	}
}