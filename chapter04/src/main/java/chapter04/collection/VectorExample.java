package chapter04.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<String> list = new Vector<String>();
		list.add("둘리");
		list.add("마이콜");
		list.add("또치");

		// 순회 1
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + " ");
		}
		System.out.println();

		// 삭제
		list.remove(1);

		// 순회 2
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.print(s + " ");
		}
		System.out.println();

		// 교체
		list.set(1, "도우너");

		// 순회 3
		// list 자리에는 Iterable을 구현한 객체만 들어갈 수 있음
		// 내부적으로 iterator() 사용
		for (String s : list) {
			System.out.print(s + " ");
		}
	}

}
