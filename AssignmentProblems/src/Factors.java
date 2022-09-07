import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factors factors = new Factors();
		factors.factorsOfNumber(n);
	}

	public void factorsOfNumber(int n) {
		System.out.println("Factors of " + n + " are:");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
