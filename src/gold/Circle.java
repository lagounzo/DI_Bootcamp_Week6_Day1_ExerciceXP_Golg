/**
 * @author N'ZO LAGOU
 * 
 *  Exercice 1 : Constructeur De Cercle

Concevoir une classe nommée Circle.

Construisez trois objets circulaires de rayon 2,0, 12 et 24

Affichez le rayon et l'aire de chacun.

Un constructeur sans argument fixe la valeur par défaut de radius à 1.

Une getArea()fonction est utilisée pour retourner l'aire du cercle.

Implémentez maintenant la classe.
 * 
 */





package gold;

public class Circle {

	 private double radius;

	    public Circle() {
	        this.radius = 1;
	    }

	    public double getRadius() {

	        return radius;

	    }

	    public void setRadius(double radius) {

	        this.radius = radius;

	    }

	    
	    public String toString() {

	        return "Circle [radius=" + radius + "]";

	    }

	    public double getArea() {

	        double aire = ((this.radius * this.radius * Math.PI) / 2);

	        return aire;

	    }

	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		
		Circle circle2 = new Circle();
		
		Circle circle3 = new Circle();
		
		circle1.setRadius(2.0);
		
		circle2.setRadius(12);
		
		circle3.setRadius(24);
		
		double aire1 = ((circle1.getRadius() * circle1.getRadius() * Math.PI) / 2);
		
		double aire2 = ((circle2.getRadius() * circle1.getRadius() * Math.PI) / 2);
		
		double aire3 = ((circle3.getRadius() * circle1.getRadius() * Math.PI) / 2);
		
		System.out.println("Afficher le rayon  " + circle1.toString() + " Aire du cercle est  :  " + aire1);
		
		System.out.println("Afficher le rayon  " + circle2.toString() + " Aire du cercle est  :  " + aire2);
		
		System.out.println("Afficher le rayon  " + circle3.toString() + " Aire du cercle est  :  " + aire3);
		
		Circle circle = new Circle();
		
		System.out.println("Aire du cercle  " + circle.getArea());

	}

}
