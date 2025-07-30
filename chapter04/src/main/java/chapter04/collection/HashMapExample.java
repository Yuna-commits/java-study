package chapter04.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("one", 1); // auto boxing
		map.put("two", 2);
		map.put("three", 3);

		int i = map.get("one"); // auto unboxing
		int j = map.get(new String("one"));

		System.out.println(i + " : " + j);
		// 이전의 값을 반환, 없으면 null 반환
		System.out.println(map.put("three", 333));
		System.out.println(map.put("four", 444));
		System.out.println(map.get("three"));
	}

}
