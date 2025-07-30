package chapter04.collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.offer("마이콜");
		queue.offer("둘리");
		queue.offer("또치");

		while (!queue.isEmpty()) {
			String s = queue.poll();
			System.out.print(s + " ");
		}

		// 비어있는 경우 -> null 반환(Stack에선 에러)
		System.out.println(queue.poll());

		queue.offer("마이콜");
		queue.offer("둘리");
		queue.offer("또치");

		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
	}

}
