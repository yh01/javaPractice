package rpgDao;

public class AttackDAO {
	int PlayerHP,EnemyHP,a,b;
	public String Patk(String PatkPOINT , String EnemyHP){
		a = Integer.parseInt(EnemyHP);
		b = Integer.parseInt(PatkPOINT);
		this.EnemyHP = a - b;
		return Integer.toString(this.EnemyHP);
	}
}
