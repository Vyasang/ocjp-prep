public class TestFloat {
	public static void main(String[] args) {
		float value1 = 102;
		float value2 = (int)102.0;
		float value3 = 1f * 0.0; //Does not compile due to incompatible type, conversion between double to float
		float value4 = 1f * (short)0.0; 
		float value5 = 1f * (boolean)0; //Does not cmpile due to imcompatible type, conversion between int to boolean
		float value6 = 102f;

		System.out.println("1: " + value1);
		System.out.println("2: " + value2);
		System.out.println("3: " + value3);
		System.out.println("4: " + value4);
		System.out.println("5: " + value5);
		System.out.println("6: " + value6);
	}
}