public class Stroka {
//array of numbers in rows, output: string sum of these numbers
	public static void main(String[] args) {
		Str s;
		s = new Str();	
	    s.Op();   
	}
	
	public static class Str {
		private String[] num = {"2", "5", "7", "8", "3"}; 
		private int sum = 0;
	
	public int Op(){
	
     for (int i = 0; i < num.length; i++) {
		
		int n = Integer.valueOf(num[i]);
		
		sum = sum + n;	
		
	}
	String summa = Integer.toString(sum);
	System.out.println(summa);
	return 0;
	}
}
}
 