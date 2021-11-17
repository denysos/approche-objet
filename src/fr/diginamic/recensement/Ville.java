package fr.diginamic.recensement;

public class Ville {
	private String codeRegion = "";
	private String nomRegion = "";
	private String codeDepartement = "";
	private String codeCommune = "";
	private String nomCommune = "";
	private String populationTotale = "";
	
	
	
	
	
	
	
	public Ville(String nomCommune) {
		super();
		this.nomCommune = nomCommune;
	}
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune,
			String populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
//	private void setCodeRegion(String codeRegion) {
//		this.codeRegion = codeRegion;
//	}
//	private void setNomRegion(String nomRegion) {
//		this.nomRegion = nomRegion;
//	}
//	private void setCodeDepartement(String codeDepartement) {
//		this.codeDepartement = codeDepartement;
//	}
//	private void setCodeCommune(String codeCommune) {
//		this.codeCommune = codeCommune;
//	}
//	private void setNomCommune(String nomCommune) {
//		this.nomCommune = nomCommune;
//	}
//	private void setPopulationTotale(String populationTotale) {
//		this.populationTotale = populationTotale;
//	}
	public String getCodeRegion() {
		return codeRegion;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public String getCodeDepartement() {
		return codeDepartement;
	}
	public String getCodeCommune() {
		return codeCommune;
	}
	public String getNomCommune() {
		return nomCommune;
	}
	public String getPopulationTotale() {
		return populationTotale;
	}
}
