import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("Enter a base and exponent value");
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		int e = sc.nextInt();

		long result = 1;

		while (e != 0) {
			result = result * b;
			e--;
		}
		System.out.println("Result : " + result);

	}

}
