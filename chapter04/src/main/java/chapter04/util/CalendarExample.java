package chapter04.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 컴퓨터의 현재 시간(GregorianCalendar)

		printDate(cal.getTime());
		printDate(cal);

		cal.set(Calendar.YEAR, 2024);
		cal.set(Calendar.MONTH, 11); // 12월(month -1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);

		cal.set(2025, 7, 29);
		cal.add(Calendar.DATE, 10000); // +10000일
		printDate(cal);
	}

	private static void printDate(Date d) {
		// 2025-07-29 11:11:11
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(d);

		System.out.println(date);
	}

	private static void printDate(Calendar cal) {
		final String[] DAYS = { "일", "월", "화", "수", "목", "금", "토" };

		// 년도(+1900)
		int year = cal.get(Calendar.YEAR);

		// 월(0~11, +1)
		int month = cal.get(Calendar.MONTH) + 1;

		// 일
		int date = cal.get(Calendar.DATE);

		// 요일(1~7, Sun~Sat)
		int day = cal.get(Calendar.DAY_OF_WEEK);

		// 시
		int hour = cal.get(Calendar.HOUR);

		// 분
		int minute = cal.get(Calendar.MINUTE);

		// 초
		int second = cal.get(Calendar.SECOND);

		System.out.printf("%d-%02d-%02d (%s요일) %02d:%02d:%02d\n", year, month, date, DAYS[day - 1], hour, minute,
				second);

	}

}
