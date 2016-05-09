package ctrlDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date1 {
	public static void main(String[]args){
//		Date date = new Date();
//		System.out.println(date);
//		System.out.println(date.getTime());
//		Date p = new Date(1458551276180L);
//		System.out.println(p);
//		Instant i1 = Instant.now();
//		Instant i2 = Instant.ofEpochMilli(1458551276180L);
//		long l = i2.toEpochMilli();
//
//		ZonedDateTime z1 = ZonedDateTime.now();
//		ZonedDateTime z2 = ZonedDateTime.of(2014, 1,2,3,4,5,6, ZoneId.of("Asia/Tokyo"));
//
//		Instant i3 = z2.toInstant();
//		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
//		System.out.println("tokyo:"+z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
//		LocalDateTime l1 = LocalDateTime.now();
//		LocalDateTime l2 = LocalDateTime.of(2016, 3,21,18,29);
//		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
//		LocalDateTime l3 = z1.toLocalDateTime();
//		System.out.println(l3);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate d = LocalDate.parse("2016/03/21",f);
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println(str);

		LocalDate d1 = LocalDate.of(2016, 1, 1);
		LocalDate d2 = LocalDate.of(2016, 3, 21);
		Period p2 = Period.between(d1, d2);
		Period d3 = p2;
		System.out.println(d3);
	}
}
