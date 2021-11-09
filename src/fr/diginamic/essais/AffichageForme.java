package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
//		Object;
		System.out.println(forme.toString());
		System.out.println("perimetre : " + forme.calculerPerimetre());
		System.out.println("surface : " + forme.calculerSurface());
		System.out.println();
	}

}
