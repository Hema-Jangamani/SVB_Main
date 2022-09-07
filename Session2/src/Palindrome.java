import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		if (str.equals(str1)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}

}
