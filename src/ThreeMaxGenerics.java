
public class ThreeMaxGenerics<T extends Comparable<T>> {
		
		T num1;
		T num2;
		T num3;

		ThreeMaxGenerics(T num1, T num2, T num3) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}

		public T maximum() {

			if (num1.compareTo(num2) > 0) {
				return num1;
			} else if (num2.compareTo(num3) > 0) {
				return num2;
			} else {
				return num3;
			}
		}

		public static void main(String[] args) {
			
			ThreeMaxGenerics<Integer> compareInteger = new ThreeMaxGenerics<Integer>(2345, 12, 7);
			System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());
			
			ThreeMaxGenerics<Float> comapreFloat = new ThreeMaxGenerics<Float>(123.f, 345f, 678f);
			System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());
			
			ThreeMaxGenerics<String> compareString = new ThreeMaxGenerics<String>("Apple", "Orange", "potato");
			System.out.println("Maximum among three string is: " + compareString.maximum());
		}
	}
	
