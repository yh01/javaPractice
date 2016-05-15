package day;

class Empty{}
class HERO{}
public class Object1 {
	public static void printAnything(Object o){
		System.out.println(o.toString());
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Empty e = new Empty();
		String s = e.toString();
		System.out.println(s);
		Object o1 = new Empty();
		Object o2 = new HERO();
		Object o3 = "こんにちわ";
		System.out.println(o3);
		printAnything(o3);
	}

}
