package DiffAbstractInterface;

//Principal Class
public class AbstractResidentEvilInterfaceChallenge {
	static int nemesisRaids = 0;

	public static void main(String[] args) {
		// lamdas function
		Zombie zombie = () -> System.out.println("Graw!!! " + nemesisRaids++);
		// 1
		System.out.println("Etape 1 : ");
		System.out.println("Nemesis raids: " + nemesisRaids);
		Nemesis nemesis = new Nemesis() {
			public void shoot() {
				shoots = 23;
			}
		};
		// 2
		System.out.println("Etape 2 : ");
		Zombie.zombie.shoot();
		// 3
		System.out.println("Etape 3 : ");
		zombie.shoot();
		// 4
		System.out.println("Etape 4 : ");
		nemesis.shoot();
		// 5
		System.out.println("Etape 5 : ");
		System.out.println("Nemesis shoots: " + nemesis.shoots + " and raids: " + nemesisRaids);
	}
}

//Interface Class
interface Zombie {
	Zombie zombie = () -> System.out.println("Stars!!!");

	void shoot();
}

//Abstract Class
abstract class Nemesis implements Zombie {
	public int shoots = 5;
}
