import java.util.Arrays;
import java.util.Scanner;

public class Chocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Give the value of N:");
		int N = s.nextInt();
		System.out.println("Give the value of M:");
		int M = s.nextInt();
		Chocolates choco = new Chocolates();
		choco.chocolates(M, N);
	}

	public void chocolates(int M, int N) {
		int counter = 1;
		int start = 0;
		int value;
		while ((start + M) % N != 0) {
			value = (start + M) % N;
			start = value;
			counter++;
		}
		System.out.println("count " + counter);
	}

}
