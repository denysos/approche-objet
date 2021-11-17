package maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		// dev :

		mapVilles.put(59, "Lilles");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		
		System.out.println("clé de mapVilles : ");
		for (int cle : mapVilles.keySet()) {
			System.out.println(cle);
		}
		
		System.out.println();
		System.out.println("nom des villes : ");
		for (String nomVille : mapVilles.values()) {
			System.out.println(nomVille);
		}
		
		System.out.println();
		System.out.println("taille de mapVilles : " + mapVilles.size());
	}

}
