package Test9;

import java.util.ArrayList;

public class LeetCodeSortIntegers {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		String binary = " ";
		int tmp, min, k;
		int l = arr.length;
		ArrayList<Integer> bit = new ArrayList<Integer>();
		System.out.println("Convertir les valeurs en Bit /n");
		for (int i = 0; i < arr.length; i++) {
			int compteur = 0;
			binary = Integer.toBinaryString(arr[i]);
			for (int j = 0; j < binary.length(); j++) {
				if (binary.charAt(j) == '1') {
					compteur += 1;
				}
			}
			System.out.println("Compteur: " + compteur);
			bit.add(compteur);
		}
		System.out.println("trier le tableau de int /n");
		for (int i = 1; i < l; i++) {
			System.out.println("******Start : " + i);
			int key = bit.get(i);
			System.out.println("Key bit: " + key);
			int valeur = arr[i];
			System.out.println("Valeur arr: " + valeur);
			k = i - 1;
			System.out.println("k: " + k);
			System.out.println("Valeur K: " + bit.get(k));
			while (k >= 0 && bit.get(k) > key) {
				System.out.println("While boucle");
				arr[k + 1] = arr[k];
				bit.set(k + 1, bit.get(k));
				k--;
				System.out.println("K while: " + k);
			}
			arr[k + 1] = valeur;
			for (int j : arr)
				System.out.println("End : " + j);
		}
	}
}
