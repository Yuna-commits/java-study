package chapter04.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getDefault();
		System.out.println("System TimeZone: " + timeZone.getID());
		System.out.println("GMT Offset: GMT+" + timeZone.getRawOffset() / (1000 * 60 * 60));

		TimeZone timeZoneNY = TimeZone.getTimeZone("America/New_York");
		System.out.println("New York TimeZone: " + timeZoneNY.getID());

		System.out.println("====================");

		// 세계 주요 도시 현재 시각
		Date now = new Date();
		String[] worldZones = { "Asia/Seoul", "Asia/Tokyo", "Europe/London", "America/New_York", "Australia/Sydney" };

		for (String tzID : worldZones) {
			TimeZone tz = TimeZone.getTimeZone(tzID);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
			sdf.setTimeZone(tz);

			System.out.printf("%16s : %s\n", tzID, sdf.format(now));
		}

		System.out.println("====================");

		// 밀리 초(ms)
		// ex) SNS에서 사진 포스팅 시간 DB에 세팅할 때 사용
		long createdAtMillis = Calendar.getInstance().getTimeInMillis();
		System.out.println("DB 저장 timestamp (UTC 기준 millis): " + createdAtMillis);

		// ex) 영국(런던)에 사는 팔로워인 경우
		Date postDate = new Date(createdAtMillis);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		sdf.setTimeZone(TimeZone.getTimeZone("Europe/London"));
		System.out.println("영국(런던): " + sdf.format(postDate));
	}

}
