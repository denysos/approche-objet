package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	private Piece[] pieces = new Piece[3];
	private int nombreDePieces = 0;

	public int nbParTypeDePiece(String typeDePiece) {
		int nbDePieces = 0;
		for (int i = 0; i < nombreDePieces; i++) {
			//eviter == !
			if (pieces[i].getType().equals(typeDePiece)) {
				nbDePieces++;
			}
		}
		return nbDePieces;
	}

	public int nbParTypeDePieceClass(String typeDePiece) {
		int nbDePieces = 0;
		String tp = "";
		for (int i = 0; i < nombreDePieces; i++) {
			tp = pieces[i].getClass().getSimpleName();
			if (tp.equals(typeDePiece)) {
//			if (tp == typeDePiece) {
				nbDePieces++;
			}
		}
		return nbDePieces;
	}

	public void ajouterPiece(Piece piece) {

		if (piece != null) {

			// lorsqu'on ajoute une piece, l'index de la piece à ajouter est nombreDePieces
			// puisque le dernier élément du tableau est à l'index nombreDePices - 1

			if (nombreDePieces >= pieces.length) {
				pieces = Arrays.copyOf(pieces, 2 * pieces.length);
			}

			this.pieces[nombreDePieces] = piece;
			nombreDePieces++;

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

	public double superficieTypeDePiece(String typeDePiece) {
		double superficie = 0;
		for (int i = 0; i < nombreDePieces; i++) {
			if (pieces[i].getType() == typeDePiece) {
				superficie += pieces[i].getSuperficie();
			}
		}
		return superficie;

	}
}
