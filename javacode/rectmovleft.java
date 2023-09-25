import java.awt.Point;
import java.awt.Rectangle;

public class rectmovleft {
	public static Rectangle rectmovleft(Rectangle box, Point p) throws IllegalArgumentException {
		if(p.x<0) {
			throw new IllegalArgumentExeption("Usage: input x is not legal");
		}
		box.x=box.x+p.x;
		box.y=box.y+p.y;

		return box;
	}

	public static void main(String[] args) {
		Rectangle box=new Rectangle(0,0,100,200);
		Point p=new Point(3,4);

		try{
			Rectangle result=rectmovleft(box,p);
			System.out.println("Resulting Rectangle: " + result);
		} catch(IllegalArgumentExxception e) {
			System.out.println(e.getMessage());
		}
	}
}

