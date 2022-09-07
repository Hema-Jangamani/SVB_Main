import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial : "+fact);

	}

}
