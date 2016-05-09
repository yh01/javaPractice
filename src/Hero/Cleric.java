package Hero;

public class Cleric {
	static final int Mhp = 50;
	static final int Mmp = 10;
	int hp;
	int mp;
	String name;

	void selfAide(){
		this.mp -= 5;
		this.hp = Mhp;
		System.out.println(this.name + "はセルフエイドをつかった。mpが5減った。\nhpが" +this.hp+ "まで回復した");
	}
	void pray(int sec){
		int mpA = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.Mmp - this.mp,mpA);
		this.mp =+ recoverActual;
		System.out.println(this.name+"は祈った"+recoverActual+"mpが回復した");
	}

	Cleric(String name, int hp, int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	Cleric(String name, int hp){
		this.name = name;
		hp = this.Mhp;
		this.hp = hp;
		this.mp = this.Mmp;
	}
	Cleric(String name){
		this.name = name;
	}

}
