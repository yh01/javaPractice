package rpgAction;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import rpgDao.TESTDAO;

public class TESTACTION extends ActionSupport implements SessionAware{
	public String TESTRESULT;
	public String TESTINT;
	public Map<String,Object>session;
	public String execute(){
		TESTDAO dao = new TESTDAO();
		if(!session.containsKey("TESTRESULT")){
			TESTRESULT = dao.TESTMETHOD(TESTINT);
			session.put("TESTRESULT", TESTRESULT);
		}else if(session.containsKey("TESTRESULT")){
			TESTINT = (String) session.get("TESTRESULT");
			TESTRESULT = dao.TESTMETHOD(TESTINT);
			session.put("TESTRESULT", TESTRESULT);
		}
		return SUCCESS;
	}


	public String getTESTRESULT() {
		return TESTRESULT;
	}

	public void setTESTRESULT(String tESTRESULT) {
		TESTRESULT = tESTRESULT;
	}


	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
