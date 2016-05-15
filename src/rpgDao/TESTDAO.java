package rpgDao;

public class TESTDAO {
	private int TEST1;
	int a;
	public String TESTMETHOD(String TEST1){
		if(TEST1 == null){
			a = 110;
			this.TEST1 = a - 10;
			return Integer.toString(this.TEST1);
		}
		if(Integer.parseInt(TEST1) == 0){
			a = 110;
			this.TEST1 = a - 10;
			return Integer.toString(this.TEST1);
		}
		a = Integer.parseInt(TEST1);
		this.TEST1 = a - 10;
		return Integer.toString(this.TEST1);
	}
}
