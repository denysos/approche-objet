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
	public Boolean equals(Departement departement) {
		return this.codeDepartement == departement.getCodeDepartement();

	}

	@Override
	public int compareTo(Departement autreDep) {
		Integer ceDepPop = this.populationTotale;
		Integer autreDepPop = autreDep.populationTotale;
		return -1 * ceDepPop.compareTo(autreDepPop);
	}

}
