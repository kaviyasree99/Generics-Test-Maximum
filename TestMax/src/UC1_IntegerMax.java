import java.util.Scanner;

public class UC1_IntegerMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Numner: ");
		Float num1 = scanner.nextFloat();
		System.out.print("Enter Second Numner: ");
		Float num2 = scanner.nextFloat();
		System.out.print("Enter Third Numner: ");
		Float num3 = scanner.nextFloat();
		Float maximumNum = testMax(num1, num2, num3);
		System.out.println("Maximum number is : " + maximumNum);
	}

	public static Float testMax(Float num1, Float num2, Float num3) {

		Float maximumNumber = num1;
		if (num2.compareTo(maximumNumber) > 0) {
			maximumNumber = num2;
		}
		if (num3.compareTo(maximumNumber) > 0) {
			maximumNumber = num3;
		}
		return maximumNumber;
	}

}
