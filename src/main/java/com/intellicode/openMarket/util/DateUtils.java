package com.intellicode.openMarket.util;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateUtils {
	private static final String defaultPattern = "yyyy-MM-dd HH:mm:ss";
	private static final DateTimeZone zone = DateTimeZone.forOffsetHours(+9);
	
	public static String getNowTime(String pattern){
		return new DateTime(zone).toString(pattern);
	}
	
	public static String getNowTime(){
		return DateUtils.getNowTime(defaultPattern);
	}

	public static int getTimestamp(){
		return (int)new DateTime().getMillis() / 1000;
	}


	
}
