package polymorphism;

public class Wizard extends Character{
	int mp;
	public void attack(Monster m){
		System.out.println(this.name+"の攻撃");
		m.hp-=3;
	}
	public void fireball(Monster m){
		System.out.println(this.name + "の魔法");
		m.hp-=20;
		this.mp-=5;

	}
	public void heal(Hero h){
		h.hp += 10;
		System.out.println(this.name + "のヒール\n" + h.name + "のhpを10回復");
	}
}
