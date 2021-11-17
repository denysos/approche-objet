package maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import tri.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Ville> tableVilles = new HashMap<>();
		tableVilles.put("Nice", new Ville("Nice", 343000));
		tableVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
		tableVilles.put("Narbonne", new Ville("Narbonne", 53400));
		tableVilles.put("Lyon", new Ville("Lyon", 484000));
		tableVilles.put("Foix", new Ville("Foix", 9700));
		tableVilles.put("Pau", new Ville("Pau", 77200));
		tableVilles.put("Marseille", new Ville("Marseille", 850700));
		tableVilles.put("Tarbes", new Ville("Tarbes", 40600));

		System.out.println("suppression de la ville qui a le moins d'habitants : ");
//		ArrayList<Ville> listeVilles = tableVilles.values();

//		Iterator<String> cleVilles = tableVilles.keySet().iterator();
		int minHab = tableVilles.get("Nice").getNbHab();
		String villeLaMoinsPeuplee = "";
		for (Iterator iterator = tableVilles.keySet().iterator(); iterator.hasNext();) {
			String villeStr = iterator.next().toString();
			if (minHab > tableVilles.get(villeStr).getNbHab()) {
				minHab = tableVilles.get(villeStr).getNbHab();
				villeLaMoinsPeuplee = villeStr;

			}

		}
		System.out.print("la ville la moins peuplée est : " + villeLaMoinsPeuplee);
		tableVilles.remove(villeLaMoinsPeuplee);

		System.out.println();
		System.out.println();

		System.out.println("villes restantes après suppression de " + villeLaMoinsPeuplee + " : ");
		for (String ville : tableVilles.keySet()) {
			System.out.println(ville);
		}
	}

}
