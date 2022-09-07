
public class StrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Strong numbers are:");
		strongNumbers();
	}

	public static void strongNumbers() {
		for (int i = 1; i <= 500; i++) {
			int temp1 = i;
			int sum = 0;
			int fact = 1;
			while (temp1 != 0) {
				int rem = temp1 % 10;
				sum = sum + factorial(rem);
				temp1 = temp1 / 10;

			}
			if (sum == i)
				System.out.print(i + " ");
		}
	}

	public static int factorial(int rem) {
		int fact = 1;
		for (int j = 1; j <= rem; j++) {
			fact = fact * j;
		}
		return fact;
	}

}
