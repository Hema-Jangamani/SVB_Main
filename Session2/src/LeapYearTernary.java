import java.util.Scanner;

public class LeapYearTernary {

	public static void main(String[] args) {

		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int yr = sc.nextInt();

		boolean res = (yr > 0) ? ((yr % 4 == 0 && yr % 100 != 0) ? true : ((yr % 400 == 0) ? true : false)) : false;
		if (res) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not leap year");
		}

	}

}
