
public class Pile2 extends Pile {

	private Maillon debut;

	public void empiler(int n) {
		debut = new Maillon(n, debut);
	}

	public int depiler() throws ExceptionPileVide {
		int cle;

		if (estVide())
			throw new ExceptionPileVide();
		cle = debut.donnee;
		debut = debut.suivant;
		return cle;
	}

	public boolean estVide() {
		return debut == null;
	}
}

class Maillon {
	int donnee;
	Maillon suivant;

	Maillon(int donnee, Maillon suivant) {
		this.donnee = donnee;
		this.suivant = suivant;
	}
}
