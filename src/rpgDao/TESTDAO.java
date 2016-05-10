package rpgDao;

public class TESTDAO {
	private int TEST1=100;
	public String TESTMETHOD(){
		this.TEST1 = this.TEST1 - 10;
		return Integer.toString(this.TEST1);
	}
}
