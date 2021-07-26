import java.util.Scanner;

public class UC1_IntegerMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String string1 = scanner.next();
		System.out.print("Enter Second String: ");
		String string2 = scanner.next();
		System.out.print("Enter Third String: ");
		String string3 = scanner.next();
		String maximumString = testMax(string1, string2, string3);
		System.out.println("Maximum String is : " + maximumString);
	
		
		
		System.out.print("Enter First Numner: ");
		Integer num1 = scanner.nextInt();
		System.out.print("Enter Second Numner: ");
		Integer num2 = scanner.nextInt();
		System.out.print("Enter Third Numner: ");
		Integer num3 = scanner.nextInt();
		Integer maximumNum = testMax(num1, num2, num3);
		System.out.println("Maximum number is : " + maximumNum);
		
		
		
		System.out.print("Enter First Numner: ");
		Float number1 = scanner.nextFloat();
		System.out.print("Enter Second Numner: ");
		Float number2 = scanner.nextFloat();
		System.out.print("Enter Third Numner: ");
		Float number3 = scanner.nextFloat();
		Float maximumNumber = testMax(number1, number2, number3);
		System.out.println("Maximum number is : " + maximumNumber);
	}
		
		
		public static <T extends Comparable<T>> T testMax(T x, T y, T z) {

			T maximum = x;
			if (y.compareTo(maximum) > 0) {
				maximum = y;
			}
			if (z.compareTo(maximum) > 0) {
				maximum = z;
			}
			return maximum;
		}
}
		