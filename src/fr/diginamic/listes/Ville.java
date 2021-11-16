package fr.diginamic.listes;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHab;

	@Override
//	public int compareTo(Ville o) {
//		// TODO Auto-generated method stub
//
//		if (this.nom.compareTo(o.getNom()) < 0) {
//			return -1;
//		}
//
//		if (this.nom.compareTo(o.getNom()) > 0) {
//			return 1;
//		}
//		return 0;
//	}
	
	
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub

		if (Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab())) < 0) {
			return -1;
		}

		if (Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab())) > 0) {
			return 1;
		}
		return 0;
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

}
