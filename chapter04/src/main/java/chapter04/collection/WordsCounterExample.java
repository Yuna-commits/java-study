package chapter04.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsCounterExample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "java", "banana", "melon", "banana", "java");
		Map<String, Integer> wordsCounter = new HashMap<>();

		for (String word : words) {
			// 방법 1
			// word의 값이 이미 있으면 그 값을 반환, 없으면 null 반환
			Integer count = wordsCounter.get(word);
			wordsCounter.put(word, count == null ? 1 : count + 1);
			// 방법 2
			// word의 값을 반환하거나 디폴트 0 반환
			wordsCounter.put(word, wordsCounter.getOrDefault(word, 0) + 1);
		}

		System.out.println(wordsCounter);
	}

}
