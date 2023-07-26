package io.namoosori.travelclub.web.util.helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	//
	public static String today() {
		return LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
//		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
	}

	public static void main(String[] args) {
		System.out.println(today());
	}
}