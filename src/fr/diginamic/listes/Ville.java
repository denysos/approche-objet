package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHab;

//	@Override
//	public int compareTo(Ville o) {
	// TODO Auto-generated method stub
//		return this.nom.compareTo(o.getNom());
//
////		if (this.nom.compareTo(o.getNom()) < 0) {
////			return -1;
////		}
////
////		if (this.nom.compareTo(o.getNom()) > 0) {
////			return 1;
////		}
////		return 0;
//	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab()));
//		if (Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab())) < 0) {
//			return -1;
//		}
//
//		if (Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab())) > 0) {
//			return 1;
//		}
//		return 0;
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

	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
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

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHab=" + nbHab + "]";
	}

}
