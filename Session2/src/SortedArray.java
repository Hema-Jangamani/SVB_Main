import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {

		int arr[] = { 'c', 'e', 'h', 'j', 'k', 'a' };
		int min = arr[0], min_index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				min_index = i;
			}
		}
		System.out.println(min_index);

	}

}
