package paiza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kahunsyo {
	public static void main(String[] args) throws Exception {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String erm = null;
	        String readLine = br.readLine();
	        readLine = readLine.trim();
	        String[] readLineArray = readLine.split(" ");
	        int N = Integer.parseInt(readLineArray[0]);//人参のデータの数
	        int S = Integer.parseInt(readLineArray[1]);//目安となる糖分
	        int p = Integer.parseInt(readLineArray[2]);//許容誤差
	        int MAX = 0;//一番重いニンジン
	        int i;
	        int m_i[] = null;
	        int s_i[] = null;
	        for(i = 0; i <= N; i++){
	        	String readLineFor = br.readLine();
		        readLineFor = readLineFor.trim();
		        String[] readLineArray2 = readLineFor.split(" ");
	        	m_i[i] = Integer.parseInt(readLineArray2[i]);
	        	s_i[i] = Integer.parseInt(readLineArray2[i]);
	        	if(S-p <= s_i[i] && s_i[i] <= S+p){

	        	}else{
	        		erm = "not found";
	        	}
	        }
	        System.out.println(m_i[i]);
	    }
}
