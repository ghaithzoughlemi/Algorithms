package leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TargetArray {
	public static void main(String args[]) {

		/*
		 * int[] target = { 3, 9, 5 }; // isPossible(target); PriorityQueue<Integer> pq
		 * = new PriorityQueue<Integer>(); for (int i = 0; i < target.length; i++) {
		 * pq.offer(target[i]); }
		 * 
		 * // for (int j : pq) { // System.out.println("pq: " + j); // }
		 * Iterator<Integer> it = pq.iterator(); while (it.hasNext()) {
		 * System.out.println(pq.poll()); }
		 * 
		 * }
		 * 
		 * public static boolean isPossible(int[] target) {
		 * 
		 * int sum = 0; int max = 0; int indice = -1; for (int i = 0; i < target.length;
		 * i++) { sum += target[i]; if (max < target[i]) { max = target[i]; indice = i;
		 * } }
		 * 
		 * int diff = sum - max; target[indice] = max - diff;
		 * 
		 * if (target[indice] == 1) return true;
		 * 
		 * if (target[indice] > diff || diff == 0) return false;
		 * 
		 * target[indice] %= diff; return isPossible(target);
		 */
		int[] target = { 9, 3, 5 };
		int taille = target.length;
		int max = 0;
		int somme = 0;
		int[] target_result = new int[taille];

		target_result = Remplir(target_result);
		max = Max(target);
		somme = Somme(target_result);

		Boolean trouver = false;
		int ind = 0;
		while (ind < taille) {
			while ((trouver == false) && (somme <= max)) {
				trouver = Trouver(target, target_result, somme);
				somme++;
			}
			ind++;
			trouver = false;
		}

		Boolean resultat = false;
		if (Arrays.equals(target, target_result)) {
			resultat = true;
			System.out.println("Resultat: " + resultat);
		}

//		for (int j = 0; j < taille; j++) {
//			System.out.println("Target " + j + ": " + target[j]);
//			System.out.println("Target result " + j + ": " + target_result[j]);
//
//		}
//		System.out.println("Somme " + somme + " Max: " + max);

	}

	static Boolean Trouver(int[] tab, int[] tab1, int somme) {
		int i = 0;
		int taille = tab.length;
		Boolean trouver = false;
		while ((i < taille) && (trouver == false)) {
			if (somme == tab[i]) {
				tab1[i] = somme;
				trouver = true;
				break;
			}
			i++;
		}
		return trouver;
	}

	static int[] Remplir(int[] tab) {
		int taille = tab.length;
		int max = 0;
		for (int j = 0; j < taille; j++) {
			tab[j] = 1;
		}
		return tab;
	}

	static int Max(int[] tab) {
		int max = tab[0];
		int taille = tab.length;
		for (int j = 0; j < taille; j++) {
			if (max < tab[j]) {
				max = tab[j];
			}
		}
		return max;
	}

	static int Somme(int[] tab) {
		int somme = 0;
		for (int i : tab) {
			somme += i;
		}
		return somme;
	}
}
