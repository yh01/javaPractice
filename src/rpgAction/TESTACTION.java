package rpgAction;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import rpgDao.TESTDAO;

public class TESTACTION extends ActionSupport implements SessionAware{
	private String TESTRESULT;
	public String execute(){
		TESTDAO dao = new TESTDAO();
		TESTRESULT = dao.TESTMETHOD();
		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public String getTESTRESULT() {
		return TESTRESULT;
	}

	public void setTESTRESULT(String tESTRESULT) {
		TESTRESULT = tESTRESULT;
	}
}
