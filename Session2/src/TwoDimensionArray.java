import java.util.Scanner;

public class TwoDimensionArray {

	public static void main(String[] args) {

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
		System.out.println("Array elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
