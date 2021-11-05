package entites;

public class AdressePostale {
	String libelleDeLaRue;
	int numeroDeRue;
	int codePostal;
	String ville;
	
	public AdressePostale() {}
	

	public AdressePostale(int numeroDeRue, String libelleDeLaRue, int codePostal, String ville) {

		this.libelleDeLaRue = libelleDeLaRue;
		this.numeroDeRue = numeroDeRue;
		this.codePostal = codePostal;
		this.ville = ville;

	}

	@Override
	public String toString() {
		return "AdressePostale [libelleDeLaRue=" + libelleDeLaRue + ", numeroDeRue=" + numeroDeRue + ", codePostal="
				+ codePostal + ", ville=" + ville + "]";
	}


	
	
}
