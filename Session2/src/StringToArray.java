import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {

		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		char[] arr = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			System.out.print(arr[i] + " ");
		}

	}

}
