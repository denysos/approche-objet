package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Wc;

/**
 * test de l'appli immobilier
 * 
 * @author denis
 *
 */

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maison maison = new Maison();
		maison.ajouterPiece(new Cuisine(10, 0));
		maison.ajouterPiece(new Wc(2, 0));
		maison.ajouterPiece(new Chambre(10, 1));
		maison.ajouterPiece(new Wc(2, 1));

		// creation d'une piece null
		maison.ajouterPiece(null);
		// apparemment, la piece est bien créé, mais il y a un pb lors de l'appel de la
		// methode getSuperficie()

		System.out.println("superficie totale de la maison : " + Double.toString(maison.superficieTotale()));
		System.out.println("superficie rdc de la maison : " + Double.toString(maison.superficieEtage(0)));
		System.out.println("superficie 1er etage de la maison : " + Double.toString(maison.superficieEtage(1)));

		// calcul de la superficie des pieces de même type
		System.out.println("superficie totale des WC : " + maison.superficieTypeDePiece("WC"));
		
		// calcul du nombre de pieces d'un type donné
		System.out.println("nombre total de WC : " + maison.nbParTypeDePiece("WC"));
		System.out.println("nombre total de WC (class): " + maison.nbParTypeDePieceClass("Wc"));



	}

}
