package day;

import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
 public static void main(String[]args){
	 Calendar c = Calendar.getInstance();
	 Date date = new Date();
	 c.setTime(date);
	 int Y = c.get(Calendar.YEAR);
	 int M = c.get(Calendar.MONTH);
	 int D = c.get(Calendar.DAY_OF_MONTH);
	 int H = c.get(Calendar.HOUR);
	 int MN = c.get(Calendar.MINUTE);
	 int S = c.get(Calendar.SECOND);
	 StringBuffer sb = new StringBuffer();
	 System.out.println(sb.append(Y).append("年").append(M).append("月").append(D).append("日").append("\n").append(H).append("時").append(MN).append("分").append(S).append("秒"));
 }
}
