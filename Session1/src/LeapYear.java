import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		try {
			int yr = Integer.parseInt(args[0]);
			if ((yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0) {
				System.out.println(yr + " is a leap year");
			} else {
				System.out.println(yr + " is not a leap year");
			}
		} catch (Exception e) {
			System.out.println("Enter the value in the arguments");
		}
	}
}
