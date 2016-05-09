package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C1 {
	public static void main(String[]args){
		ArrayList<String> names = new ArrayList<String>();
		String a;
		for(int i = 0; i < 10; i++){
			a = "" + i;
			names.add(a);
		}
		for(int i = 0; i < names.size(); i++){
			System.out.println(names.get(i));
		}
		Iterator<String> IT = names.iterator();
		while(IT.hasNext()){
			String e = IT.next();
			System.out.println(e);
		}
		printList(names);

		Map<String, Integer> MAP = new HashMap<String, Integer>();
		MAP.put("あああ", 111);
		MAP.put("いいい", 222);
		System.out.println(MAP.get("あああ"));
	}

	public static void printList(ArrayList<String> list){
		for(String s : list){
			System.out.println(s);
		}
	}
}
