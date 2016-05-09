package Hero;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Cleric c1 = new Cleric("あああ",40,5);
		Cleric c2 = new Cleric("いいい",40);
		Cleric c3 = new Cleric("ううう");
		System.out.println("クレリック" + c1.name + "\nhp:" + c1.hp + "\nmp:" + c1.mp);
		System.out.println("クレリック" + c2.name + "\nhp:" + c2.hp + "\nmp:" + c2.mp);
	}
}

