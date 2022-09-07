import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {

		int sum = 0;

		System.out.println("Enter row and column value");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		int[][] arr = new int[r][c];
		System.out.println("Enter the elements of an array");
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		if (r == c) {
			for (int i = 0; i < r; i++) {
				for (int j = i; j <= i; j++) {
					sum = sum + arr[i][j];
				}
			}
			System.out.println("Diagonal sum = " + sum);
		} else {
			System.out.println("Rows and columns should be equal");
		}

	}

}
