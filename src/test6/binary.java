package test6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class binary {

	public static void main(String[] args) {
//		String myStr = "Hello";
//		int num = 10;
//		String bin = Integer.toBinaryString(num);
//		char result = myStr.charAt(0);
//		System.out.println(result);
//		System.out.println(bin);

		String binary = " ";
		int tmp;
		int min;

		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		// Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		ArrayList<Integer> map = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int compteur = 0;
			binary = Integer.toBinaryString(arr[i]);
			for (int j = 0; j < binary.length(); j++) {
				if (binary.charAt(j) == '1') {
					compteur += 1;
				}

			}
			map.add(compteur);
		}
		for (int i = 0; i < map.size() - 1; i++) {
			min = i;
			for (int j = i + 1; j < map.size(); j++) {
				if (map.get(j) < map.get(i)) {
					min = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
		}

//		for (int i = 0; i < map.size() - 1 ; i++) {
//			System.out.println("I FIRST: " + map.get(i));
//			for (int j = i + 1; j < map.size(); j++) {
//				System.out.println("J SECOND: " + map.get(j));
//				if (map.get(i) > map.get(j)) {
//					tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//				System.out.println("ARR: " +arr[i]);
//
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
