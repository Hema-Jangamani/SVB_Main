import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("Enter the Item:");
			String item = sc.nextLine();
			switch (item) {
			case "MD":
				System.out.println("Masala Dosa");
				flag = false;
				break;
			case "IV":
				System.out.println("Idli Vada");
				flag = false;
				break;
			case "PB":
				System.out.println("Puri Bhaji");
				flag = false;
				break;
			default:
				System.out.println("Please enter the item present in the menu");
				flag = true;
			}
			System.out.println("You want to order more items?");
			String ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Y")) {
				flag = true;
			} else if (ans.equalsIgnoreCase("N")) {
				flag = false;
			} else {
				System.out.println("Invaild input");
			}
		}

	}
}
