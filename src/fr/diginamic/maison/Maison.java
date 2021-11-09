package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	private Piece[] pieces = new Piece[3];
	private int nombreDePieces = 0;

	public double superficieTypeDePiece(String typeDePiece) {
		return 0;
		
		// essayer :
		//        String str = "Sample String";
		//        System.out.println(str.getClass().getSimpleName());
	}

	public void ajouterPiece(Piece piece) {

		if (piece != null) {

			// lorsqu'on ajoute une piece, l'index de la piece à ajouter est nombreDePieces
			// puisque le dernier élément du tableau est à l'index nombreDePices - 1

			if (nombreDePieces < pieces.length) {

				this.pieces[nombreDePieces] = piece;
				nombreDePieces++;
			} else {
				pieces = Arrays.copyOf(pieces, 2 * pieces.length);
			}
		}
	}

	public double superficieTotale() {
		double superficie = 0;
		for (int i = 0; i < nombreDePieces; i++) {
			superficie += pieces[i].getSuperficie();
		}
		return superficie;
	}

	public double superficieEtage(int etage) {
		double superficie = 0;
		for (int i = 0; i < nombreDePieces; i++) {
			if (pieces[i].getEtage() == etage) {
				superficie += pieces[i].getSuperficie();
			}

		}
		return superficie;

	}

}
