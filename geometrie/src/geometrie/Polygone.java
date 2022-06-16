package geometrie;

//classe abstraite représentant une figure faite d'un ensemble de segments continus entre des points
public abstract class Polygone extends Figure {
	
	//le polygone contient plusieurs objets Point
	//mais toujours le même nombre pour un même sous-type de Polygone
	
	//on a donc ici un des quelques cas où le tableau est plus utile que les collections en Java
	protected Point[] points;

	//le constructeur de Polygone, appelé depuis les constructeurs de ses sous-classes, prend en paramètres plusieurs Point et les range dans un tableau
	public Polygone(Point... points) {
		//je déclare d'abord le point d'origine de la figure
		super(points[0]);
		//puis je range les points dans leur ensemble dans le tableau autrePoints
		this.points = points;
	}
	
	//le calcul du périmètre peut utiliser le même algorithme pour n'importe quel nombre de points du polygone
	@Override
	public double perimetre() {
		int i;
		double peri = 0;
		//pour chaque point sauf le dernier, on fait le calcul de sa distance au point suivant
		//et on l'additionne au résultat
		for(i=0; i<points.length-1;i++) {
			peri += longueurSegment(this.points[i], this.points[i+1]);
		}
		//et pour finir on fait le calcul de la distance entre le dernier et le premier point
		peri += longueurSegment(this.points[i], this.points[0]);
		return peri;
	}
	
	//fonction statique utilitaire qui calcule la distance entre deux points donnés
	public static double longueurSegment(Point a, Point b) {
		//on calcule la différence de valeur d'abscisse des deux points
		double diffX = b.getX() - a.getX();
		//on calcule la différence de valeur d'ordonnée des deux points
		double diffY = b.getY() - a.getY();
		//et on fait la racine carrée de la somme de leurs carrés
		double distance = Math.sqrt( diffX*diffX + diffY*diffY );
		
//		//alternativement
//		double distance = Math.sqrt( pow(diffX, 2) + pow(diffY, 2) );
		
		return distance;
	}
	
}
