package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TP10 exo5 : Apprenez à manipuler une liste d’objets villes et nombre
 * d'habitants
 * 
 * @author denis
 *
 */

public class TestVilleHab {

	static Ville villeMinHab;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Ville> listeVilles = new ArrayList<>();

		listeVilles.add(new Ville("Nice", 343000));
		listeVilles.add(new Ville("Carcassonne", 47800));
		listeVilles.add(new Ville("Narbonne", 53400));
		listeVilles.add(new Ville("Lyon", 484000));
		listeVilles.add(new Ville("Foix", 9700));
		listeVilles.add(new Ville("Pau", 77200));
		listeVilles.add(new Ville("Marseille", 850700));
		listeVilles.add(new Ville("Tarbes", 40600));

		System.out.print("ville la plus peuplée : ");
		int maxHab = 0;
		String villeMaxHab = "";
		for (Ville ville : listeVilles) {
			if (ville.getNbHab() > maxHab) {
				maxHab = ville.getNbHab();
				villeMaxHab = ville.getNom();
			}
		}
		System.out.println(villeMaxHab);

		System.out.println("ville la moins peuplée : ");
		int minHab = 1000000;
		String villeMinHabNom = "";
		for (Iterator iterator = listeVilles.iterator(); iterator.hasNext();) {
			Ville ville = (Ville) iterator.next();
			if (ville.getNbHab() < minHab) {
				minHab = ville.getNbHab();
				villeMinHabNom = ville.getNom();
				villeMinHab = ville;

			}
		}
		System.out.println(villeMinHabNom);
		listeVilles.remove(villeMinHab);
		System.out.println("supprimée !");

		System.out.println();
		ArrayList<Ville> listeModifiee = new ArrayList<>();
		for (Iterator iterator = listeVilles.iterator(); iterator.hasNext();) {
			String nomVille = "";
			Ville ville = (Ville) iterator.next();
			nomVille = ville.getNom().toUpperCase();
			ville.setNom(nomVille);
			if (ville.getNbHab() > 100000) {
				nomVille.toUpperCase();
			}
			listeModifiee.add(ville);

		}

		for (Ville ville : listeModifiee) {
			System.out.println("liste plus de 100 000 hab. en majuscules : " + ville.getNom());
		}

	}

}
