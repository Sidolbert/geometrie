package geometrie;

//classe abstraite représentant une figure faite d'un ensemble de segments continus entre des points
public abstract class Polygone extends Figure {
	
	//le polygone contient plusieurs objets Point
	//mais toujours le même nombre pour un même sous-type de Polygone
	
	//on a donc ici un des quelques cas où le tableau est plus utile que les collections en Java
	protected Point[] autrePoints;

	//le constructeur de Polygone, appelé depuis les constructeurs de ses sous-classes, prend en paramètres plusieurs Point et les range dans un tableau
	public Polygone(Point... points) {
		//je crée d'abord le point d'origine de la figure
		super(points[0]);
		//puis je range les autres points dans le tableau autrePoints
		autrePoints = new Point[points.length-1];
		for(int i=1; i<points.length; i++) {
			autrePoints[i-1] = points[i];
		}
	}
	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
