package ctrString2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "あ、そっかぁ…";
		String s2 = "ケツの穴舐めろ";
		String あ,い,う;
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		while(i > 0){
			String key = br.readLine();
			if(key.equals(s1)){
				break;
			}else if(key.contains("MUR")){
				System.out.println("おいKMRァ！もしかしてMURのことが好きなのか？（青春）" );
				System.out.println("うそつけ"+key.indexOf("MUR")+"文字目に書いてあるゾ");
				String key1 = br.readLine();
				あ = key1;
				System.out.println("ヌッ！");
				String key2 = br.readLine();
				い = key2;
				System.out.println("ヌッ！");
				String key3 = br.readLine();
				う = key3;
				System.out.println("ヌッ！");
				sb.append(あ).append(い).append(う);
				String s = sb.toString();
				System.out.println(s);
				if(s.equals("いや見てないですよ")){
					System.out.println("嘘つけ絶対見てたゾ");
					break;
				}else{
					System.out.println("あ、そっかぁ…");
					String keyA = br.readLine();
					if(keyA.matches("ひでしね")){
						System.out.println("そうだよ（便上）");
						break;
					}else{
						String HIDESINE = keyA.replace(keyA, "HIDESINE");
						if(HIDESINE.matches("HIDESINE")){
							System.out.println("当たり前だよなぁ！？");
							break;
						}
					}
				}
			}
		}


	}

}
