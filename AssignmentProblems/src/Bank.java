import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		Bank bank = new Bank();
		bank.bankNote(amount);

	}

	public void bankNote(int amount) {
		Map<Integer, Integer> notesCount = new HashMap<>();
		int[] notes = { 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		for (int i = 0; i < notes.length; i++) {
			notesCount.put(notes[i], 0);
		}
		for (int i = 0; i < notes.length; i++) {
			if (amount / notes[i] > 0) {
				notesCount.put(notes[i], (int) amount / notes[i]);
				amount = amount % notes[i];
			}
		}
		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i] + ":" + notesCount.get(notes[i]));
			notesCount.values();
		}

	}

}
