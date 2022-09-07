import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WithObjectStream {

	public WithObjectStream() {
		
	}
	
	public void writeToFile() {
		int obj1 =12;
		String fileContent = "Writing to file using Object Stream ";
		
		try {
			FileOutputStream file = new FileOutputStream("WithObjectStream.txt");
			ObjectOutputStream output = new ObjectOutputStream(file);
			output.writeInt(obj1);
			output.writeObject(fileContent);
			output.close();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void readFromFile() {
		try {
			FileInputStream fileStream = new FileInputStream("WithObjectStream.txt");
			ObjectInputStream objStream = new ObjectInputStream(fileStream);
			
			System.out.println("Integer data : "+ objStream.readInt());
			System.out.println("String data : "+objStream.readObject());
			
			objStream.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
