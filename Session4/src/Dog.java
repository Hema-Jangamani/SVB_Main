import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Dog implements Serializable{
	
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
	
	public void writeToFile(Dog[] dog) {
		
		try {
			FileOutputStream file = new FileOutputStream("DogObjectStream.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);
			for(int i=0;i<dog.length;i++) {
			output.writeObject(dog[i]);}
			output.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	 public void readFromFile(Dog[] dog) {
	        try {
	            FileInputStream file = new FileInputStream("DogObjectStream.txt");
	            ObjectInputStream objStream = new ObjectInputStream(file);
	            for(int i=0;i<dog.length;i++) {
	            System.out.println("Dog data: " + objStream.readObject());
	            }
	            objStream.close();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }

	@Override
	public String toString() {
		return "Dog [breedName=" + breedName + ", cost=" + cost + ", age=" + age + "]";
	}
	 
	 
	}
