package day;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat1 {

	public static void main(String[] args) throws ParseException {
		// TODO 自動生成されたメソッド・スタブ
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = f.format(date);
		System.out.println(s);
		Date d = f.parse("2016/05/13 10:53:25");
		System.out.println(d);
	}

}
