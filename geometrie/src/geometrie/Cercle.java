package geometrie;

public class Cercle extends Figure {
	
	double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public Cercle(Point p, double rayon) {
		super(p);
		this.rayon=rayon;
	
	}

	@Override
	public double perimetre() {
		double peri = Math.PI*2*rayon;
				
		return peri;
	}

	@Override
	public double surface() {
		double surf = Math.PI*rayon*rayon;
		return surf;
	}

	@Override
	public String toString() {
		return "Le Cercle a un rayon de " + rayon + 
				" et un perimetre de " + perimetre() + 
				" et une surface de " + surface();
	}

	
}
