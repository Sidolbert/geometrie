package geometrie;

//représente un point de quadrillage avec une abscisse et une ordonnée
public class Point {
	
	private double x;
	private double y;
	
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//le constructeur par défaut travaille avec les coordonnées zéro du graphique
	public Point() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return "Point (x= " + this.x + " , y=" + this.y + ")";
	}
	
	
	
}
