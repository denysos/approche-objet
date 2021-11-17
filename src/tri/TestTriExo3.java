package tri;

import java.util.ArrayList;
import java.util.Collections;

//import fr.diginamic.listes.Ville;

/**
 * tp 13-tri - exo 3 
 * utilisation des Comparator
 * @author denis
 *
 */

public class TestTriExo3 {

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

		Collections.sort(listeVilles, new ComparatorHabitant());

		System.out.println("tri des villes selon nombre d'habitant avec interface Comparator");
		for (Ville ville : listeVilles) {
			System.out.println(ville.getNbHab() + " " + ville.getNom());
		}

		
		System.out.println();
		Collections.sort(listeVilles, new ComparatorNom());

		System.out.println("tri alphabetique des villes avec interface Comparator");
		for (Ville ville : listeVilles) {
			System.out.println(ville.getNom() + " " + ville.getNbHab());
		}

	}

}
