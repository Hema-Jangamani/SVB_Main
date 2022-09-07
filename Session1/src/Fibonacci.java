import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int f1 = 0;
		int f2 = 1;
		int f3;

		System.out.print(f1 + " ");
		System.out.print(f2 + " ");

		for (int i = 2; i < n; i++) {
			f3 = f1 + f2;
			System.out.print(f3 + " ");
			f1 = f2;
			f2 = f3;

		}

	}

}
