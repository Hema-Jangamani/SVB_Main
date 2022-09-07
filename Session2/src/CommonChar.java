import java.util.Scanner;

public class CommonChar {

	public static void main(String[] args) {

		System.out.println("Enter two strings");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();

		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
