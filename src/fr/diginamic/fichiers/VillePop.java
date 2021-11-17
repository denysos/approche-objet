package fr.diginamic.fichiers;

public class VillePop implements Comparable<VillePop> {
	private String nom;
	private String codeDepartement;
	private int population;
	private String populationStr;

	public VillePop(String nom, String codeDepartement, String population) {
		super();
		this.nom = nom;
		this.codeDepartement = codeDepartement;
		setPopulation(population);
		setPopulationStr(population);
		
	}
	
	@Override
	public int compareTo(VillePop autreVille) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getPopulationStr() {
		return populationStr;
	}

	private void setPopulationStr(String population) {
		this.populationStr = population;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		String[] populationTabStr = population.split(" ");
		String populationStrClean = "";
		for (int i = 0; i < populationTabStr.length; i++) {
			populationStrClean = populationStrClean + populationTabStr[i];
		}

		this.population = Integer.valueOf(populationStrClean);
	}

	@Override
	public String toString() {
		return "VillePop [nom=" + nom + ", codeDepartement=" + codeDepartement + ", population=" + population + "]";
	}



}
