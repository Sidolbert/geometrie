package geometrie;

public abstract class Figure implements Calcul {
	
	//le premier point de la figure
	protected Point origine;
	
	
	//ce constructeur est toujours appelé depuis les enfants
	//jamais directement vu qu'on instancie pas la classe abstraite Figure
	public Figure() {
		this.origine = new Point();
	}
	
	public Figure(Point p) {
		this.origine = p;
	}
	
	
	
	//on a pas besoin d'implémenter directement dans la classe abstraite
	//les méthodes de l'interface : il faut juste qu'elles soient implémentées
	//une fois dans les classes concrètes
	
}
