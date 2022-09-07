import java.util.ArrayList;
import java.util.List;

interface Shape{
	
	void draw(GraphicsContext gc);
}

class Rectangle implements Shape{
	
	public void draw(GraphicsContext gc) {
		gc.drawRect(20,20,50,70);
	}
}
class Circle implements Shape{
	public void draw(GraphicsContext gc) {
		gc.drawCircle(50,50,100);
	}
}
class Diamond implements Shape{
	public void draw(GraphicsContext gc) {
		gc.drawDiamond(20,30,30,20);
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = new ArrayList<>();
		
		shapes.add(new Rectangle());
		shapes.add(new Circle());
		shapes.add(new Diamond());
		
		GraphicsContext gc = new GraphicsContext();
		shapes.forEach(shape->shape.draw(gc));

	}
}
