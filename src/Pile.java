import java.util.ArrayList;

public abstract class Pile {

	ArrayList<Integer> liste = new ArrayList<Integer>();

	void empiler(int n) {

		liste.add(n);

	}

	int depiler() throws ExceptionPileVide {
		if (estVide())
			throw new ExceptionPileVide();
		return liste.remove(liste.size() - 1);

	}

	boolean estVide() {
		return liste.size() == 0;
	}
}
