package polymorphism;

public abstract class Character {
	String name;
	private int hp;
	public void run(){
		System.out.println(this.name + "は逃げ出した");
	}
	public abstract void attack(Monster m);
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
}
