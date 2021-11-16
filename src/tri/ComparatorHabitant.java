package tri;

import java.util.Comparator;

import fr.diginamic.listes.Ville;

public class ComparatorHabitant implements Comparator<Ville>{

	@Override
	public int compare(Ville ville1, Ville ville2) {
		// TODO Auto-generated method stub
		
		int result = Integer.valueOf(ville1.getNbHab()).compareTo(Integer.valueOf(ville2.getNbHab()));
		
		return result;
	}

}
