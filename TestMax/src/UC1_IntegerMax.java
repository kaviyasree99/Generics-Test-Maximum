import java.util.Scanner;

public class UC1_IntegerMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Numner: ");
		Integer num1 = scanner.nextInt();
		System.out.print("Enter Second Numner: ");
		Integer num2 = scanner.nextInt();
		System.out.print("Enter Third Numner: ");
		Integer num3 = scanner.nextInt();
		Integer maximumNum = testMax(num1, num2, num3);
		System.out.println("Maximum number is : " + maximumNum);
	}

	public static Integer testMax(Integer num1, Integer num2, Integer num3) {

		Integer maximumNumber = num1;
		if (num2.compareTo(maximumNumber) > 0) {
			maximumNumber = num2;
		}
		if (num3.compareTo(maximumNumber) > 0) {
			maximumNumber = num3;
		}
		return maximumNumber;
	}

}
