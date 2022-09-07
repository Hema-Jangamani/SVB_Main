import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1 = new Dog();

		Dog[] dogObj = new Dog[3];
		for (int i = 0; i < dogObj.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Dog " + i + " details like breedname, cost , age: ");
			Dog d = new Dog(sc.next(), sc.nextLong(), sc.nextInt());
			dogObj[i] = d;
		}

		d1.writeToFile(dogObj);

		while(true) {
			try {
				d1.readFromFile(dogObj);
			}catch (Exception e) {
				e.getMessage();
			}
			break;
		}
		

	}

}
