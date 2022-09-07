import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WithBufferedWriter {
	
	public WithBufferedWriter() {
		
	}
	
	void writeToFile() {
		String text = "Writing to file using Buffered writer";
		
		try {
			BufferedWriter f_writer = new BufferedWriter(new FileWriter("bufferedWriter.txt"));
			f_writer.write(text);
			System.out.print(text);
			System.out.print(" File is created successfully with the content.");
			f_writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
	}
	
	void readFile() {
		
		char[] array = new char[100];
		try {
			FileReader file = new FileReader("bufferedWriter.txt");
			
			BufferedReader input = new BufferedReader(file);
			
			input.read(array);
			System.out.println("\n****Data in the file: ");
			System.out.println(array);
			input.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}

}
