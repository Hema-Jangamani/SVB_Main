import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueExample{
	
	Queue<Message> queobj = new LinkedList<>();
	
	public void add(Message obj) {
		queobj.add(obj);
	}
	
	public void display() {
		Iterator<Message> iterator = queobj.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}

	
	
	

}
