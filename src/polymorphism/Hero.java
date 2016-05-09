package polymorphism;

public class Hero extends Character{
	String name;
	int hp;
	Sword sword;
	static int money;

	static void setRandomMoney(){
		Hero.money = (int)(Math.random() * 1000);
	}

	public void attack(Monster m){
		m.hp-=5;
		System.out.println(this.name + "は攻撃した\n敵に5ダメージあたえた");
	}

	void dropMoney(){
		this.money -= 10;
		System.out.println(this.name+"は10円おとした" + this.money + "円になった");
	}

	void sleep(){
		this.hp=100;
		System.out.println(this.name + "は、眠って回復した");
	}

	void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + "は座って回復した" + sec + "回復した");
	}

	void slip(){
		this.hp -= 5;
		System.out.println(this.name + "は転んだ。5のダメージ");
	}

	public void run(){
		System.out.println(this.name+"はにげだした"+"\n"+"GAMEOVER"+"\n"+"最終HPは"+this.hp+"でした");
	}
	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	Hero(){
		System.out.println("hero");
	}
}
