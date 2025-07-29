package chapter04.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();// 컴퓨터의 현재시간

		System.out.println(now); // KST(Korea Standard Time)로 출력

		printDate01(now);
		printDate02(now);

		Date d1 = new Date(0); // KST (1970년 01월 01일 00:00:00 UTC) + 9
		printDate02(d1);

		long millis = d1.getTime(); // long type(ms)
		d1.setTime(millis + 1000); // 1초 추가
		printDate02(d1);
		
		// deprecated
		Date d2 = new Date(2025 - 1900, 6, 29);
		Date d3 = new Date(2025 - 1900, 6, 29, 12, 0, 0);
	}

	private static void printDate02(Date d) {
		// 2025-07-29 11:11:11
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(d);

		System.out.println(date);
	}

	private static void printDate01(Date d) {
		// 년도(+1900)
		int year = d.getYear();

		// 월(0~11, +1)
		int month = d.getMonth();

		// 일
		int date = d.getDate();

		// 시
		int hours = d.getHours();

		// 분
		int minutes = d.getMinutes();

		// 초
		int seconds = d.getSeconds();

		System.out.printf("%d-%02d-%02d %02d:%02d:%02d\n", (year + 1900), (month + 1), date, hours, minutes, seconds);
	}

}
