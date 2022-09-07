import java.time.LocalDateTime;
import java.time.LocalTime;

public class Message{
	
	String event;
	LocalTime timeStamp;
	
	Message(){
		event = null;
		timeStamp = LocalTime.now();
	}
	
	Message(String msg){
		event = msg;
		timeStamp = LocalTime.now();
	}

	@Override
	public String toString() {
		return "Message [event=" + event + ", timeStamp=" + timeStamp + "]";
	}
	
	
}


