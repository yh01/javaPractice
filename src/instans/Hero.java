package instans;

public class Hero implements Cloneable{
	private String name;
	private int hp, mp;
	public Hero(String name) {
		this.name = name;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public String toString(){
		return "勇者（名前："+ this.name +"/HP ="+ this.hp + "/MP = " + this.mp +")";
	}
	public Hero clone(){
		Hero result = new Hero(this.name);
		result.name = this.name;
		result.hp = this.hp;
		result.mp = this.mp;
		return result;
	}
}
