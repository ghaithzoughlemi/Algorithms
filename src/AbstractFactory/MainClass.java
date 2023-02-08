package AbstractFactory;

public class MainClass {
	public static void main(String[] args) {

		Company anc = new Ancien();
		ChaiseProduct ancien_chaise = anc.createchaise();
		SofaProduct ancien_sofa = anc.createsofa();
		
		Company mod = new Modern();
		ChaiseProduct modern_chase = mod.createchaise();
	}

}
