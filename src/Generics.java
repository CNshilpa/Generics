
public class Generics {
	public static float compareTo(float num1, float num2, float num3) {

		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {
			return num2;
		} else {
			return num3;
		}}
		public static int compareTo(int num1, int num2, int num3) {

			if (num1 > num2 && num1 > num3) {
				return num1;
			} else if (num2 > num3) {
				return num2;
			} else {
				return num3;
			}
	}

	public static void main(String[] args) {

		System.out.println("maximum Number for 1st float test case=" + Generics.compareTo(5.1f, 3.6f, 2.7f));
		System.out.println("maximum Number for 2nd float test case=" + Generics.compareTo(2.7f, 6.0f, 3.70f));
		System.out.println("maximum Number for 3rd float test case=" + Generics.compareTo(1.2f, 3.1f, 2.2f));
		System.out.println("\n\n");
		System.out.println("maximum Number for 1st integer test case=" + Generics.compareTo(53, 57, 24));
		System.out.println("maximum Number for 2nd integer test case=" + Generics.compareTo(77, 90, 43));
		System.out.println("maximum Number for 3rd integer test case=" + Generics.compareTo(12, 78, 80));
	}
}
