import java.util.Scanner;

interface abc {
	static String st = "PrimaryColors";
}

enum color implements abc {
	Red(25), Green(30), Yellow(38);

	color(int j) {
		value = j;
	}

	int value;

	int getValue() {
		return value;
	}
}

public class EnumExample {

	public EnumExample() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		
		color c1 = color.Red;
		color c2 = color.Green;
		
			System.err.println();
		System.out.println("Value of c2:" + c2.getValue() + c2.st + " Ordinal of c2: " + c2.ordinal());

		System.out.println(c1);
		switch (c1) {
		case Red:
			System.out.println(c1.getValue() + c1.st + " Ordinal: " + c1.ordinal());
			break;

		case Green:
			System.out.println(c1.ordinal());
			break;

		case Yellow:
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + c1);
		}

	}

}
