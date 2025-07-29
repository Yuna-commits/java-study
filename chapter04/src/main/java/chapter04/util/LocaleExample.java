package chapter04.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {

	public static void main(String[] args) {
		// 현재 시스템 로케일 (언어_국가) -> ko_KR
		Locale locale = Locale.getDefault();
		System.out.println(locale);

		// 여러 국가별로 날짜 표현
		Date now = new Date();// 컴퓨터의 현재시간

		DateFormat dfKorea = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		System.out.println("한국: " + dfKorea.format(now)); // 2025. 7. 29.

		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println("미국: " + dfUS.format(now)); // Tuesday, July 29, 2025

		DateFormat dfJapan = DateFormat.getDateInstance(DateFormat.LONG, Locale.JAPAN);
		System.out.println("일본: " + dfJapan.format(now)); // 2025年7月29日
	}

}
