package day;
class Hero2{
	String NAME;
	int HP;
	public String toString(){
		return "名前:" + this.NAME + "\nHP:"+this.HP;
	}
}
public class Object2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero2 h = new Hero2();
		h.NAME = "TEST";
		h.HP = 100;
		System.out.println(h);
	}

}
