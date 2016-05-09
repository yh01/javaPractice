package polymorphism;

public final class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Character[] c = new Character[5];
		c[0] = new SuperHero();
		c[1] = new Hero();
		c[2] = new Wizard();
		c[3] = new Hero();
		c[4] = new Hero();
		for(Character ch :c){
			ch.run();
		}
	}
}

