import java.util.Scanner;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char[] num = n.toCharArray();
		int len = num.length;

		if (len == 0) {
			System.out.println("empty string");
			return;
		}
		if (len > 3) {
			System.out.println("Length more than 3 is not supported");
			return;
		}

		String[] single_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };

		String[] two_digits = new String[] { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
				"seventeen", "eighteen", "nineteen" };

		String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };

		String[] tens_power = new String[] { "hundred" };

		if (len == 1) {
			System.out.println(single_digits[num[0] - '0']);
			return;
		} else if (len == 2) {
			if (num[0] - '0' == 1) {
				System.out.println(two_digits[num[1] - '0']);
				return;
			} else if (num[0] - '0' > 1) {
				if (num[1] - '0' == 0) {
					System.out.println(tens_multiple[num[0] - '0']);
					return;
				} else {
					System.out.print(tens_multiple[num[0] - '0'] + " ");
					System.out.println(single_digits[num[1] - '0']);
					return;
				}

			}
		} else if (len == 3) {
			if (num[0] - '0' == 1 && num[1] - '0' == 0 && num[2] - '0' == 0) {
				System.out.println(tens_power[0]);
				return;
			} else {
				System.out.print(single_digits[num[0] - '0'] + " ");
				System.out.print(tens_power[0] + " ");
				if (num[1] - '0' == 0) {
					System.out.print("and ");
					System.out.println(single_digits[num[2] - '0']);
					return;
				}
				if (num[1] - '0' == 1) {
					System.out.print("and ");
					System.out.println(two_digits[num[1] - '0']);
					return;
				} else if (num[1] - '0' > 1) {
					System.out.print("and ");
					if (num[1] - '0' == 0) {
						System.out.println(tens_multiple[num[1] - '0']);
						return;
					} else {
						System.out.print(tens_multiple[num[1] - '0'] + " ");
						if (num[2] - '0' > 0) {
							System.out.println(single_digits[num[2] - '0']);
						}
						return;
					}

				}

			}

		}

	}

}
