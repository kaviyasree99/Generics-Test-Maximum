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
	}

	public static String testMax(String string1, String string2, String string3) {

		String maximumString = string1;
		if (string2.compareTo(maximumString) > 0) {
			maximumString = string2;
		}
		if (string3.compareTo(maximumString) > 0) {
			maximumString = string3;
		}
		return maximumString;
	}

}
