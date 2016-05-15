package rpgDao;

public class EnemyActionDAO {
	int PlayerHP,EnemyHP,a,b;
	public String Eatk(String EatkPOINT , String PlayerHP){
		a = Integer.parseInt(PlayerHP);
		b = Integer.parseInt(EatkPOINT);
		this.PlayerHP = a - b;
		return Integer.toString(this.PlayerHP);
	}
}
