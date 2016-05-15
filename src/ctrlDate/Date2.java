package ctrlDate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Instant i1 = Instant.now();
		System.out.println(i1);
		LocalDateTime i2 = LocalDateTime.now();
		System.out.println(i2);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(f);
	}

}
