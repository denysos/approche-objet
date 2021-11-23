package fr.diginamic.testenumeration;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHab;
	private Continents continent;



	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab()));

	}



	public Ville(String nom, int nbHab, Continents continent ) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	@Override
	public boolean equals(Object object) {
		
		// tester le type du parametre :
		if (!(object instanceof Ville)) {
			return false;
		}
		
		// caster le type Ville sur le parametre :
		Ville other = (Ville) object;
		
		
		// faire la comparaison :
		return nom.equals(other.getNom()) && nbHab == other.getNbHab();

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHab() {
		return nbHab;
	}

	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}
	
	public Continents getContinent() {
		return continent;
	}

	public void setContinent(Continents continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHab=" + nbHab + " sur le continent : " + continent +"]";
	}

}
