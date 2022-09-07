import java.util.HashSet;
import java.util.Set;

public class Cars {
	
	Set<String> india = new HashSet<>();
	Set<String> japanese = new HashSet<>();
	Set<String> set1 = new HashSet<>();

	public void display() {
		// TODO Auto-generated method stub
			
		india.add("Maruti Suzuki");
		india.add("Mahindra");
		india.add("TATA");
		india.add("Hindustani Motors");
		
		set1.addAll(india);
		System.out.println("India Cars: "+india);
		
		
		japanese.add("Honda");
		japanese.add("Toyota");
		japanese.add("Nissan");
		japanese.add("Mitsuhishi");
		japanese.add("Maruti Suzuki");
		
		System.out.println("Japanese Cars: "+japanese);
	}
	
	
	
	public void displayAll() {
		india.addAll(japanese);
		System.out.println("All cars: "+india);
		
	}
	
	public void intersection() {
		set1.retainAll(japanese);
		System.out.println("Intersection: "+set1);
	}
	
//	public void clone() {
//	    Set<String> copy = new HashSet<>(india);
//	    System.out.println(copy);
//	}
}
