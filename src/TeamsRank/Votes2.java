package TeamsRank;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Votes2 {
	public static void main(String[] args) {
		String[] votes = { "ABC", "ACB", "ABC", "ACB", "ACB" };
		Map<Character, Map<Integer, Integer>> map = new HashMap<>();

		// Recuperation de 1ere mot
		int positionCount = votes[0].length();

		for (String vote : votes) {
			for (int i = 0; i < vote.length(); i++) {
				char c = vote.charAt(i);
				map.computeIfAbsent(c, k -> new HashMap<>());
				map.get(c).put(i, map.get(c).getOrDefault(i, 0) + 1);
			}
		}

		System.out.println("MAP: " + map);

		PriorityQueue<Character> priorityQueue = new PriorityQueue<>((o1, o2) -> {
			for (int i = 0; i < positionCount; i++) {
				System.out.println("O1 : " + o1 + " ,O2 : " + o2);
				int c = map.get(o2).getOrDefault(i, 0) - map.get(o1).getOrDefault(i, 0);
				if (c != 0) {
					return c;
				}
			}
			return o1 - o2;
		});

		System.out.println("Priority : " + priorityQueue);
		System.out.println("keySet : " + map.keySet());
		priorityQueue.addAll(map.keySet());

		System.out.println("Priority1 : " + priorityQueue);

		StringBuilder sb = new StringBuilder();
		while (!priorityQueue.isEmpty()) {
			sb.append(priorityQueue.poll());
		}

		System.out.println("Final: " + sb.toString());
	}
}
