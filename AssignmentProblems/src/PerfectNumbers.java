
public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNumbers p = new PerfectNumbers();
		p.perfect();

	}

	public void perfect() {
		System.out.println("Perfect numbers are ");
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i && sum != 0) {
				System.out.print(i + " ");
			}

		}
	}

}
