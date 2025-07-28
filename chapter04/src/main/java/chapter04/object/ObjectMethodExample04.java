package chapter04.object;

import java.util.HashSet;
import java.util.Set;

public class ObjectMethodExample04 {

	public static void main(String[] args) {
		Set<Rect> set = new HashSet<>();

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);
		Rect r3 = new Rect(4, 50);

		set.add(r1);
		set.add(r2);
		set.add(r3);

		// hashCode 오버라이드 안하면, r1, r2를 다른 객체로 봄 -> 2개 출력
		// 오버라이드 하면, r1, r2를 같은 객체로 봄 -> 1개 출력ㄴ
		System.out.println(set);
	}

}
