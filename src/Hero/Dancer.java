package Hero;

public class Dancer extends Character{
	public void dance(){
		System.out.println(this.name+"は踊った");
	}
	public void attack(Matango m){
		System.out.println(this.name + "攻撃");
		System.out.println("敵に3ポイントダメージ");
		m.hp -= 3;
	}
}
