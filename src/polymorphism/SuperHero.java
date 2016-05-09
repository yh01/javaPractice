package polymorphism;

public class SuperHero extends Hero{
	private boolean flying;
	public void fly(){
		this.setFlying(true);
		System.out.println("飛び上がる");
	}
	public void land(){
		this.setFlying(false);
		System.out.println("着地");
	}
	public void run(){
		System.out.println("撤退した");
	}
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
	public SuperHero(){
		super();
		System.out.println("superHero");
	}

	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
}
