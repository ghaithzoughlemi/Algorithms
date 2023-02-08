package test3;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class map {
	public static void main(String[] args) {
		/**
		 * Scanner s = new Scanner( "R A\n" + "R D\n" + "A R\n" + "A C\n" + "D R\n" + "C
		 * A\n" + "C F\n" + "F C\n" + "F B\n" + "F E\n" + "B F\n" + "B E\n" + "E F\n" +
		 * "E B\n");
		 */

		Scanner sc = new Scanner(System.in);

		LinkedHashMap<Integer, List<Integer>> map = new LinkedHashMap<Integer, List<Integer>>();

		int k;
		int v;

		for (int i = 0; i < 5; i++) {

			k = sc.nextInt();
			v = sc.nextInt();
			if (!map.containsKey(k))
				map.put(k, new LinkedList<Integer>());
			if (!map.containsKey(v))
				map.put(v, new LinkedList<Integer>());
			map.get(k).add(v);
			map.get(v).add(k);

		}
		System.out.println(map);
		System.out.println("Key : " + map.keySet());

		int x = map.get(4).size();

		System.out.println(x);
		System.out.println(map.containsKey(2));
		for (int i : map.get(4)) {
			System.out.println(i);

		}

		/**
		 * System.out.println(map2); for (String k : map2.keySet()) {
		 * System.out.println(k); if (!map.containsKey(k)) map.put(k, new
		 * LinkedList<String>()); map.get(k).add(map2.get(k)); }
		 * System.out.println("Map: " + map);
		 */

	}

}
