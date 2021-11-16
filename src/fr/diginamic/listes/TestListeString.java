package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * TP10 exo 4 : Apprenez à manipuler une liste de chaines de caractères
 * 
 * @author denis
 *
 */

public class TestListeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> listeDeVilles = new ArrayList<>();
		String[] tableauDesVilles = { "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes" };

		for (int i = 0; i < tableauDesVilles.length; i++) {
			listeDeVilles.add(tableauDesVilles[i]);
		}

		System.out.print("Ville avec le plus grand nombre de lettres : ");

		String villeLaPlusLongue = "";
		for (String ville : tableauDesVilles) {
			if (ville.length() > villeLaPlusLongue.length()) {
				villeLaPlusLongue = ville;
			}
		}
		System.out.println(villeLaPlusLongue);

		System.out.println("mise en majuscule de tous les noms de ville : ");
		int index = 0;
		for (String ville : listeDeVilles) {

			listeDeVilles.set(index, ville.toUpperCase());

//			System.out.println(ville);
			index++;
		}

		for (String ville : listeDeVilles) {

			System.out.println(ville);

		}


		System.out.println();

		System.out.println("liste des villes qui ne commencent pas par n : ");

		for (Iterator iterator2 = listeDeVilles.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			if (string.charAt(0) == 'N') {
				iterator2.remove();
			}

		}
		for (String ville : listeDeVilles) {
			System.out.println(ville);

		}

	}

}
