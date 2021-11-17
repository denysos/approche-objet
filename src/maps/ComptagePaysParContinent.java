package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * TP 12 HasMap exo 5 comptage des pays par continent
 * 
 * @author denis
 *
 */

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Pays> listeDesPays = new ArrayList<>();

		listeDesPays.add(new Pays("France", 65, "Europe"));
		listeDesPays.add(new Pays("Allemagne", 80, "Europe"));
		listeDesPays.add(new Pays("Belgique", 10, "Europe"));
		listeDesPays.add(new Pays("Russie", 150, "Asie"));
		listeDesPays.add(new Pays("Chine", 1400, "Asie"));
		listeDesPays.add(new Pays("Indonésie", 220, "Oceanie"));
		listeDesPays.add(new Pays("Australie", 20, "Oceanie"));

		HashMap<String, Integer> recencement = new HashMap<>();

		for (Pays pays : listeDesPays) {
			String continent = pays.getContinent();
			int population = pays.getNbHabitants();
			recencement.putIfAbsent(continent, 0);
			Integer nbDePaysPrecedent = recencement.get(continent);
//			if (nbDePaysPrecedent == null) {
//				nbDePaysPrecedent = 0;
//			}
			
			//attention, si on met nbDePaysPrecedent++, l'incrementation est faite après l'affectation !
			int nbDePays = ++nbDePaysPrecedent;   
			recencement.put(continent, nbDePays);

		}
		Collection<String> listeContinents = recencement.keySet();
		System.out.println("resultats : ");
		for (String continent2 : listeContinents) {
			System.out.println(continent2 + " : " + recencement.get(continent2) + " pays");
		}

	}

}
