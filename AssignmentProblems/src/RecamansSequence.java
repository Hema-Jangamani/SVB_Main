import java.util.Scanner;

public class RecamansSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of terms");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		RecamansSequence rec = new RecamansSequence();
		rec.recamanSequence(n);
	}

	public void recamanSequence(int n) {
		int[] a = new int[n];
		a[0] = 0;
		System.out.print(a[0] + ", ");

		for (int i = 1; i < n; i++) {
			int rec = a[i - 1] - i;
			for (int j = 0; j < i; j++) {
				if (a[j] == rec || rec < 0) {
					rec = a[i - 1] + i;
					break;
				}
			}
			a[i] = rec;
			System.out.print(a[i] + ", ");
		}
	}
}
