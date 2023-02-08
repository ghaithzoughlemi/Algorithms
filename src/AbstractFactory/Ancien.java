package AbstractFactory;

import Variantes.AncienChaise;
import Variantes.AncienSofa;
import Variantes.AncienTable;

public class Ancien extends Company {

	@Override
	public ChaiseProduct createchaise() {
		System.out.println("Ancienne chaise cr��e !");
		return new AncienChaise();
		// TODO Auto-generated method stub

	}

	@Override
	public SofaProduct createsofa() {
		System.out.println("Ancien sofa cr�� !");
		return new AncienSofa();
		// TODO Auto-generated method stub

	}

	@Override
	public TableProduct createtable() {
		System.out.println("Ancienne table cr��e !");
		return new AncienTable();
		// TODO Auto-generated method stub

	}

}
