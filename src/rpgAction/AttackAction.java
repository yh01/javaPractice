package rpgAction;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import rpgDao.AttackDAO;
import rpgDao.EnemyActionDAO;

public class AttackAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	public String PlayerHP,EnemyHP,PatkPOINT,EatkPOINT,COMMENT;
	int EnemyAction;
	public String execute(){
		AttackDAO dao = new AttackDAO();
		EnemyActionDAO eDao = new EnemyActionDAO();
		if(!session.containsKey("PlayerHP")){
			PlayerHP = "100";
			EnemyHP = "100";
			PatkPOINT = "20";
			EatkPOINT = "10";
			session.put("PlayerHP", PlayerHP);
			session.put("EnemyHP", EnemyHP);
			session.put("PatkPOINT", PatkPOINT);
			session.put("EatkPOINT", EatkPOINT);
			COMMENT = "ゲームスタート";
			return SUCCESS;
		}
		PatkPOINT = (String) session.get("PatkPOINT");
		EatkPOINT = (String) session.get("EatkPOINT");
		PlayerHP = (String) session.get("PlayerHP");
		EnemyHP = (String) session.get("EnemyHP");

		EnemyHP = dao.Patk(PatkPOINT, EnemyHP);
		session.put("EnemyHP", EnemyHP);
		EnemyAction = 1;
		if(EnemyAction == 1){
			PlayerHP = eDao.Eatk(EatkPOINT, PlayerHP);
			session.put("PlayerHP", PlayerHP);
		}
		COMMENT = "プレイヤーの攻撃。敵に"+PatkPOINT+"のダメージ"+ "\n" + "敵の攻撃。プレイヤーに"+EatkPOINT+"のダメージ";
		return SUCCESS;
	}

	public String getCOMMENT() {
		return COMMENT;
	}

	public void setCOMMENT(String cOMMENT) {
		COMMENT = cOMMENT;
	}

	public String getPlayerHP() {
		return PlayerHP;
	}

	public void setPlayerHP(String playerHP) {
		PlayerHP = playerHP;
	}

	public String getPatkPOINT() {
		return PatkPOINT;
	}

	public void setPatkPOINT(String patkPOINT) {
		PatkPOINT = patkPOINT;
	}

	public String getEatkPOINT() {
		return EatkPOINT;
	}

	public void setEatkPOINT(String eatkPOINT) {
		EatkPOINT = eatkPOINT;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getEnemyHP() {
		return EnemyHP;
	}

	public void setEnemyHP(String enemyHP) {
		EnemyHP = enemyHP;
	}

	public Map<String, Object> getSession() {
		return session;
	}
}
