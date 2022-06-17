package geometrie;

import java.util.Arrays;

public class Rectangle extends Polygone {

	public Rectangle(Point... points) {
		super(points);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double surface() {
		
		double surf = longueurSegment(points[0], points[1])*
		              longueurSegment(points[1], points[2]);
		              
		return surf;
		
	}

	

}
