package instans;

import java.util.HashSet;
import java.util.Set;

class Hero1{
	String name;
	int hp;
	public int hashCode(){
		int result = 37;
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;
		return result;
	}
}

public class Instans {
	public static void main(String[]args){
		Set<Hero1> list = new HashSet<Hero1>();
		Hero1 h1 = new Hero1();
		h1.name = "minato";
		list.add(h1);
		System.out.println("要素数："+ list.size());
		h1 = new Hero1();
		h1.name = "minato";
		list.remove(h1);
		System.out.println("要素数:"+list.size());

		Hero h = new Hero("minato");
		Hero h2 = h.clone();
		System.out.println(h);
		System.out.println(h2);

	}
}
