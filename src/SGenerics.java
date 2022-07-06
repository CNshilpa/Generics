
public class SGenerics {
	
public static void main(String[] args) {
		
		System.out.println("maximum Number for 1st string test case=" + SGenerics.compareTo("Apple", "Peach", "Banana"));
		System.out.println("maximum Number for 2nd string test case=" + SGenerics.compareTo("peach", "banana", "mango"));
		System.out.println("maximum Number for 3rd string test case=" + SGenerics.compareTo("banana", "apple", "orange"));																								// position.
	}

	private static String compareTo(String name1, String name2, String name3) {
		int num1 = name1.compareTo(name2);
		int num2 = name1.compareTo(name3);
		int num3 = name2.compareTo(name3);

		if (num1 > num2 && num1 > num2) {
			return name1;
		} else if (num2 > num3) {
			return name2;
		} else {
			return name3;
		}
	}

}
