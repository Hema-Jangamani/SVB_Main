import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

interface st1{
	final String red = "Red";
}

public class WithFileOutputStream {
	
	public WithFileOutputStream() {
		
	}
	
	public void writeToFile() {
		
		String fileContent = "Write into file using FileOutputStream";
		
		try {
			
			FileOutputStream outputStream = new FileOutputStream("fileOutputStream.txt");
			byte[] strToBytes = fileContent.getBytes();
			outputStream.write(strToBytes);
			System.out.println("File is created successfully with the content.");
			outputStream.close();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	
	void readFromFile() {
		try {
			
			FileInputStream input = new FileInputStream("fileOutputStream.txt");
			input.skip(5);
			System.out.println("\n*******Input stream after skipping 5 bytes:");
			
			int i = input.read();
			while(i != -1) {
				System.out.print((char)i);
				
				i = input.read();
			}
			input.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}
	
}
