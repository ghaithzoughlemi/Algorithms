import javax.swing.JFrame;

public class InterfacePile {
	public static void main(String[] arg) {
		JFrame fenetre = new JFrame("Essayer une pile d'entiers");
		fenetre.setContentPane(new Principal());
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		fenetre.pack();
		fenetre.setLocation(100, 100);
	}
}