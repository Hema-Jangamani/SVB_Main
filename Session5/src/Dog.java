
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Dog implements Serializable {

	String breedName;
	long cost;
	int age;

	public Dog() {

	}

	public Dog(String breedName, long cost, int age) {
		this.breedName = breedName;
		this.cost = cost;
		this.age = age;
	}

	public void writeToFile(ArrayList<Dog> list) {

		try {
			FileOutputStream file = new FileOutputStream("DogObjectStream.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);
			output.writeObject(list);
			output.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void readFromFile(ArrayList<Dog> list) {
		try {
			FileInputStream file = new FileInputStream("DogObjectStream.txt");
			ObjectInputStream objStream = new ObjectInputStream(file);
			System.out.println("Dog data: " + objStream.readObject());
			objStream.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	 public  static void display(ArrayList< Dog> d) {
	        Iterator iterate = d.iterator();
	        while(iterate.hasNext()) {
	            System.out.println(iterate.next());
	        }
	    }
	    
	    public static void delete(ArrayList<Dog> d) {
	        Iterator iterate = d.iterator();
	        while(iterate.hasNext()) {
	            iterate.remove();
	        }
	    }

	@Override
	public String toString() {
		return "Dog [breedName=" + breedName + ", cost=" + cost + ", age=" + age + "]";
	}

}
