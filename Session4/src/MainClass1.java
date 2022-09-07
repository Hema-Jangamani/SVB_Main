
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WithBufferedWriter buff = new WithBufferedWriter();
//		buff.writeToFile();
//		buff.readFile();
		
		WithFileOutputStream file = new WithFileOutputStream();
		file.writeToFile();
		file.readFromFile();

	}

}
