package Reference;

public class Principal {

	public static void main(String[] args) {
		Personne personne = new Personne();
		affiche(personne);
		System.out.println("Nom : " + personne.getNom() + " Age: " + personne.getAge());
	}

	static void affiche(Personne p) {
		Personne p1 = new Personne();
		p.setNom("Sama");
		p.setAge(30);

		p1.setNom("Seif");
		p1.setAge(27);
	}

}
