package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carre carre = new Carre(10);
		AffichageForme.afficher(carre);

		
		
		Rectangle rectangle = new Rectangle(10, 20);
		AffichageForme.afficher(rectangle);
		
		Cercle cercle = new Cercle(10);
		AffichageForme.afficher(cercle);
		
	}



}
