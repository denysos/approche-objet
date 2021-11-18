package fr.diginamic.recensement;

public class Region {
	private String codeRegion;
	private String nomRegion;
	private int populationRegionTotale;
	
	public Region(String codeRegion, String nomRegion, int populationRegion) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationRegionTotale = populationRegion;
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public int getPopulationTotale() {
		return populationRegionTotale;
	}
	

}
