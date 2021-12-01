package fr.diginamic.recensement;

public class Departement implements Comparable<Departement> {
	private String codeDepartement;
	private int populationTotale;

	public Departement(String codeDepartement, int populationTotale) {
		super();
		this.codeDepartement = codeDepartement;
		this.populationTotale = populationTotale;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

//	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Departement)) {
			return false;
		}
		Departement other = (Departement) object;
		return codeDepartement.equals(other.getCodeDepartement()) && populationTotale == other.getPopulationTotale();

	}

	@Override
	public int compareTo(Departement autreDep) {
		Integer ceDepPop = this.populationTotale;
		Integer autreDepPop = autreDep.populationTotale;
		return -1 * ceDepPop.compareTo(autreDepPop);
	}

}
