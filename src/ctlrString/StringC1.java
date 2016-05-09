package ctlrString;

public class StringC1 {
	public static void main(String[]args){
		String s1 = "すっきりJAVA", s2 = "java", s3 = "JaVa";
		if(s2.equals(s3)){
			System.out.println(s2+"と"+s3+"は正しい");
		}
		if(s2.equalsIgnoreCase(s3)){
			System.out.println(s2+"と"+s3+"はケースを区別しなければ正しい");
		}
		if(s2.contains("J")){
			System.out.println("Jある");
		}else{
			System.out.println("ない");
		}
		if(s1.endsWith("JAVA")){
			System.out.println("末尾JAVA");
		}
		//System.out.println(s1.indexOf("J"));
		//System.out.println(s1.lastIndexOf("A"));
		//System.out.println(s1.charAt(0)+""+s1.charAt(1));
		//System.out.println(s1.substring(0,3));
		//System.out.println(s1.replace("JAVA", "VAJA"));
		//System.out.println(s1+"の文字数；"+s1.length());
		//StringBuilder JAVA = new StringBuilder();
		//for(int i = 0; i < 100; i++){
		//	JAVA.append("JAVA");
		//}
		//String J = JAVA.toString();
		//System.out.println(J);
//		String s = "JAVA";
//		s.matches("JAVA");
//		s.matches("JAVAJAVA");
//		s.matches("java");
//		if(s.matches("[A-Z]{4}")){
//			System.out.println("true");
//		}else{
//			System.out.println("miss");
//		}
//		String s = "abc,def,ghi";
//		String[] w = s.split("[,:]");
//		for(String wd : w){
//			System.out.println(wd+"->");
//		}
//		String W = s.replaceAll("[aeg]", "B");
//		System.out.println(W);
		String s = String.format("%d日で%sわかる%s入門",3,"すっきり","JAVA");
		System.out.println(s);
	}
}
