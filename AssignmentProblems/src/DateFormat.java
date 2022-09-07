import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the date");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		DateFormat dateformat = new DateFormat();
		dateformat.date(str);
	}

	public void date(String str) {
		String s = "(( )?([0-2]\\d|(30|31))/(0[1-9]|1[0-2])/\\d\\d\\d\\d)|(( )?([0-2]\\d|(30|31))/(0[1-9]|1[0-2])/\\d\\d)";
		Pattern p = Pattern.compile(s);
		Matcher matcher = p.matcher(str);
		while (matcher.find()) {
			System.out.println("Date : " + matcher.group());
		}
	}
}
