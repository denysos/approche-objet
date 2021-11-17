package maps;

public class Ville implements Comparable<Ville> {

	private String nom;
	private int nbHab;

	public Ville(String nom, int nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(this.nbHab).compareTo(Integer.valueOf(o.getNbHab()));

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

}
