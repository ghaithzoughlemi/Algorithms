package PriorityQueue;

import java.util.*;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

		pQueue.add(3);
		pQueue.add(6);
		pQueue.add(5);
		pQueue.add(4);

		System.out.println("1: " + pQueue.toString());
		System.out.println("Highest priority element 1 : " + pQueue.peek());
//		pQueue.remove();
//		System.out.println("5: " + pQueue.toString());
//		int val = pQueue.poll();
//		System.out.println(val);
//		System.out.println("6: " + pQueue.toString());
//		int val1 = pQueue.peek();
//		System.out.println(val1);

		PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});

		queue.add(3);
		queue.add(6);
		queue.add(5);
		queue.add(4);
		System.out.println("Highest priority element: " + queue.peek());
		System.out.println("2: " + queue.toString());
	}

}
