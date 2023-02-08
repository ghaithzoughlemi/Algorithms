package AbstractFactory;

import Variantes.AncienChaise;
import Variantes.AncienSofa;
import Variantes.AncienTable;

public class Ancien extends Company {

	@Override
	public ChaiseProduct createchaise() {
		System.out.println("Ancienne chaise créée !");
		return new AncienChaise();
		// TODO Auto-generated method stub

	}

	@Override
	public SofaProduct createsofa() {
		System.out.println("Ancien sofa créé !");
		return new AncienSofa();
		// TODO Auto-generated method stub

	}

	@Override
	public TableProduct createtable() {
		System.out.println("Ancienne table créée !");
		return new AncienTable();
		// TODO Auto-generated method stub

	}

}
