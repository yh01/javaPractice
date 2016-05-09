package classes;
class Hero{
	public String name;
	public int hp,mp;
}

class Pockets<E>{
	private Object data;
	public void put (Object object){
		this.data = object;
	}
	public Object get(){
		return this.data;
	}
}

class Outer{
	int oF;
	static int oSF;
	static class Inner{
		void innerM(){
			oSF = 10;
		}
	}
	void oM(){
		Inner ic = new Inner();
	}
}

public class Main {
	int oM2;
	void oM2(){
		int a = 10;
		class Inner{
			public void InnerM(){
				System.out.println("innerMです");
				System.out.println(oM2);
			}
		}
		Inner ic = new Inner();
		ic.InnerM();
	}
	enum AccountType{
		FUTSU,TOUZA,TEIKI;
	}
	public static void prints(Object a , Object b){
		for (int i=0; i< (Integer)b; i++){
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pockets<String> p = new Pockets<String>();
		p.put(new Object(){
			String iF = "aaa";
			void InnerM(){
				System.out.println(iF);
			}
		});

	}

}
