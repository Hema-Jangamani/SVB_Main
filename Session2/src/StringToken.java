import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		
		System.out.println("Enter the details");
		String[] str = new String[100];
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		str = str1.split("\\|");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}
