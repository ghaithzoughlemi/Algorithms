
public class Pile3 extends Pile {

	private int taille = 3;
	private int increment = 2;
	private int[] tableau = new int[taille];
	private int hauteur; // nombre d'entiers rangés

	public void empiler(int n) {
		if (hauteur == taille) {
			taille = taille + increment;
			int[] tableauBis = new int[taille];
			for (int i = 0; i < hauteur; i++)
				tableauBis[i] = tableau[i];
			tableau = tableauBis;
		}
		tableau[hauteur] = n;
		hauteur++;
	}

	int depiler() throws ExceptionPileVide {

		if (estVide())
			throw new ExceptionPileVide();
		hauteur--;
		return tableau[hauteur];
	}

	boolean estVide() {
		return hauteur == 0;
	}
}
