package Hero;

public class Wizard {
	String name;
	int hp;
	void heal(Hero h){
		h.hp += 10;
		System.out.println(this.name + "のヒール\n" + h.name + "のhpを10回復");
	}
}
