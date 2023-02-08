package TeamsRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Votes {

	public static void main(String[] args) {
		String[] votes = { "ABC", "ACB", "ABC", "ACB", "ACB" };
		Map<Character, Map<Integer, Integer>> map = new LinkedHashMap<Character, Map<Integer, Integer>>();

		int positionCount = votes[0].length();
		char team = ' ';
		char team2 = ' ';
		int pos = 0;
		int count = 0;

		// StringBuilder result = new StringBuilder();

		for (int j = 0; j < positionCount; j++) {
			pos = j;
			for (int k = 0; k < votes.length; k++) {
				String vote = votes[k];
				team = vote.charAt(j);
				count = 0;
				for (int l = 0; l < votes.length; l++) {
					String vote2 = votes[l];
					team2 = vote2.charAt(j);

					if (team == team2) {
						count++;
					}
				}
				if (!map.containsKey(team))
					map.put(team, new LinkedHashMap<Integer, Integer>());
				map.get(team).put(pos + 1, count);
			}
		}

		System.out.println("Map : " + map.toString());

		PriorityQueue<Character> priorityQueue = new PriorityQueue<>((o1, o2) -> {
			for (int i = 0; i < positionCount; i++) {
				int c = map.get(o2).getOrDefault(i, 0) - map.get(o1).getOrDefault(i, 0);
				if (c != 0) {
					return c;
				}
			}
			return o1 - o2;
		});
		priorityQueue.addAll(map.keySet());
		StringBuilder sb = new StringBuilder();
		while (!priorityQueue.isEmpty()) {
			sb.append(priorityQueue.poll());
		}
		System.out.println(sb.toString());
	}
}
/*
 * map = map.entrySet().stream().map(entry -> { if (entry.getValue() == null)
 * entry.setValue(defaultValue); return entry;
 * }).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
 */

/*
 * 
 * 
 * int taille = map.size(); System.out.println("Taille :" + taille); for (int v
 * = 0; v < taille; v++) { Map<Integer, Integer> url = map.get(v); int max =
 * url.get(0); for (Character name : map.keySet()) {
 * 
 * if (max < url.get(v)) { max = url.get(v); } }
 * 
 * result.append(max);
 * 
 * }
 * 
 * System.out.println(result);
 */
/*
 * // using values() for iteration over values for (Map<Integer, Integer> url :
 * map.values()) { for (int v = 0; v < taille; v++) {
 * 
 * System.out.println("value: " + url.get(v));
 * 
 * } }
 */
