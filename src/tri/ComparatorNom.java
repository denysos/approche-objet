package tri;

import java.util.Comparator;

import fr.diginamic.listes.Ville;

public class ComparatorNom implements Comparator<Ville> {

	@Override
	public int compare(Ville ville1, Ville ville2) {
		// TODO Auto-generated method stub

		int result = ville1.getNom().compareTo(ville2.getNom());
		return result;
	}

}
