package AbstractFactory;

import Variantes.ModernChaise;
import Variantes.ModernSofa;
import Variantes.ModernTable;

public class Modern extends Company {

	@Override
	public ChaiseProduct createchaise() {
		System.out.println("Modern chaise créée !");
		return new ModernChaise();
		// TODO Auto-generated method stub

	}

	@Override
	public SofaProduct createsofa() {
		System.out.println("Modern sofa créée !");
		return new ModernSofa();
		// TODO Auto-generated method stub

	}

	@Override
	public TableProduct createtable() {
		System.out.println("Modern table créée !");
		return new ModernTable();
		// TODO Auto-generated method stub

	}

}
