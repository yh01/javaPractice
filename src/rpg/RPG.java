package rpg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Hero{
	int HP,MP;
	String NAME = "TESTくん";
	void attack(Enemy e){
		System.out.println(e.NAME+"に20のダメージ");
		e.HP = e.HP - 20;
	}
	String run(){
		System.out.println(this.NAME + "は逃げ出した");
		return "run";
	}
	void heal(Hero h){
		h.HP = h.HP + 20;
		System.out.println("20回復した");
	}
}
class Enemy{
	int HP,MP;
	String NAME;
	void attack(Hero h){
		System.out.println(h.NAME+"に10ダメージ");
		h.HP = h.HP - 10;
	}
	String run(){
		System.out.println(this.NAME + "は逃げ出した");
		return "run";
	}
}
public class RPG {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		Enemy e = new Enemy();
		h.HP = 100;
		e.HP = 50;
		e.NAME = "a";
		String HRUN = null,ERUN = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(;;){
			System.out.println("現在の" + h.NAME+ "のHP" + h.HP + "\n" + e.NAME + "のHP" + e.HP );
			System.out.println(" ");
			System.out.println("攻撃:１,逃げる:2,回復:3 ");
			String HERO = br.readLine();
			switch(HERO){
			case "1":
				System.out.println(h.NAME + "の攻撃");
				h.attack(e);
				break;
			case "2":
				HRUN = h.run();
				break;
			case "3":
				h.heal(h);
				break;
			}
			if(HRUN == "run"){
				break;
			}else if(e.HP <= 0){
				System.out.println(e.NAME + "を倒した");
				break;
			}
			int ENEMY = 0;
			if(e.HP == 10){
				ENEMY = new java.util.Random().nextInt(1);
			}
			switch(ENEMY){
			case 0:
				System.out.println(e.NAME + "の攻撃");
				e.attack(h);
				break;
			case 1:
				ERUN = e.run();
				break;
			}
			if(ERUN == "run"){
				break;
			}else if(h.HP <= 0){
				System.out.println("GAME OVER");
				break;
			}
			System.out.println(" ");

			System.out.println(" ");

		}
	}

}
