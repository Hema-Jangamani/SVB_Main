import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VaneckSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		GenerateSeries(sc.nextInt());
	}

	static void GenerateSeries(int terms) {
		int[] series = new int[150];
		series[0] = 0;
		series[1] = 0;

		for (int count = 1; count < terms; count++) {
			int count2 = count - 1;
			for (; count2 >= 0; count2--) {
				if (series[count] == series[count2]) {
					series[count + 1] = (count - count2);
					break;
				}
			}
			if (count2 == -1)
				series[count + 1] = 0;
		}

		for (int index = 0; index < terms; index++) {
			System.out.print(series[index] + ",");
		}
	}

}
