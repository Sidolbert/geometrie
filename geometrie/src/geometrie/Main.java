package geometrie;

public class Main {

	public static void main(String[] args) {
		// c'est ici qu'on voit si ça fonctionne
		
		Point a = new Point();
		Point b = new Point(2, 3.5);
		Point c = new Point(1,2);
		Point d = new Point (0, 1 );
		Point f = new Point (1, 1);
		Point g = new Point ( 1, 0);
		
		System.out.println(a);
		System.out.println(b);
		
		//on teste un triangle
		Triangle t1 = new Triangle(a,b,c);
		System.out.println(t1);

		Rectangle r1 = new Rectangle (a, g, f, d);
		System.out.println(r1);
		
		Cercle c1 = new Cercle (10);
		System.out.println(c1);
		
		
		
		
		
	}

	
}
