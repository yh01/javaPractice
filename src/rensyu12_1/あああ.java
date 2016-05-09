package rensyu12_1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class あああ {
	public static void main(String [] args) throws IOException{
		String msg = "URLエンコードされたユーザー入力メッセージ";
		URL url = new URL("http://foo.jp/input.jsp?msg=" + msg);
		HttpURLConnection urlconn = (HttpURLConnection)url.openConnection();
		urlconn.setRequestMethod("GET");
		urlconn.setInstanceFollowRedirects(false);
		urlconn.setRequestProperty("Accept-Language", "ja;q=0.7,en;q=0.3");
		urlconn.connect();
	}
	public void あああ(){

	}
}
