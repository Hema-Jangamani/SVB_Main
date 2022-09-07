
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Message msg = new Message("Hi");
		QueExample m = new QueExample();
		m.add(new Message("Hi"));
		m.add(new Message("Hello"));
		m.display();

	}

}
