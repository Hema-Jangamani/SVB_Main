
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0 && i % 1 == 0) {
					sum++;
				}
			}
			if (sum == 2) {
				System.out.print(i + " ");
			}

		}

	}

}
