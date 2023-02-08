package test8;

public class Split {

	public static void main(String[] args) {
		String result = "";
		String str = "hello";
		String[] words = str.split("");
		for (int i = words.length - 1; i >= 0; i--) {
			result += words[i];
		}
		System.out.println(result);

		int i = 0;
		int fabonacci = 0;
		int precedant = 0;
		int compteur = 1;
		while (i < 20) {

			fabonacci = compteur + precedant;
			compteur = precedant;
			precedant = fabonacci;
			i++;
		}
		System.out.println(fabonacci);

	}

}
