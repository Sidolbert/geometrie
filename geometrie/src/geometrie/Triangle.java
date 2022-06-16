package geometrie;

public class Triangle extends Polygone {

	public Triangle(Point... points) {
		super(points);
	}

	@Override
	public double surface() {
		
		//calcul en plusieurs étapes
		double demiPeri = this.perimetre()/2;
		//on multiplie la moitié du périmètre par elle-même moins la longueur du premier segment
		double surf = demiPeri * (demiPeri - longueurSegment(points[0], points[1]));
		//puis on multiplie le résultat par la moitié du périmètre moins la longueur du second segment
		surf = surf * (demiPeri - longueurSegment(points[1], points[2]));
		//puis on multiplie le résultat par la moitié du périmètre moins la longueur du troisième segment
		surf = surf * (demiPeri - longueurSegment(points[2], points[0]));
		//et on fait la racine carrée du résultat pour obtenir la surface
		surf = Math.sqrt(surf);
		return surf;
	}
	
	@Override
	public String toString() {
		
		String s = "le triangle est fait des points ";
		for(Point p : this.points) {
			s += "\n" + p.toString();
		}
		s += "\nle point d'origine est " + this.origine.toString();
		s += "\nson perimetre est " + this.perimetre();
		s += "\nsa surface est " + this.surface();
		return s;
		
	}

}
