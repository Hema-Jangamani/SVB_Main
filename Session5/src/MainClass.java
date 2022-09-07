import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();

        ArrayList<Dog> list = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Dog details like breedname, cost , age: ");
        //Dog d = new Dog(sc.next(),sc.nextLong(),sc.nextInt());
        list.add(new Dog(sc.next(),sc.nextLong(),sc.nextInt()));
        list.add(new Dog(sc.next(),sc.nextLong(),sc.nextInt()));
        d.display(list);
        //delete(list);
        d.writeToFile(list);
        d.readFromFile(list);

//		while (iterator.hasNext()) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter Dog details like breedname, cost , age: ");
//			Dog d = new Dog(sc.next(), sc.nextLong(), sc.nextInt());
//			list.add(d);
//		}
		
//		Dog d1 = new Dog("Lab",3000,2);
//		Dog d2 = new Dog("Pug",4000,3);
//		Dog d3 = new Dog("Pariah",5000,5);
//		list.add(d1);
//		list.add(d2);
//		list.add(d3);
//		
//		d.display(list);
//		d.delete(d1);

	}

}
