public class Program {
	//the largest numeral in three-digit number

	public static void main(String[] args) {
		RandomNum num;
		num = new RandomNum();	
	    num.Op();   
	}
	
	public static class RandomNum {
		private int a = (int) (Math.random()*(899+1)) + 100;
		private int b=a%10;
		private int c=(a/10)%10;
		private int d=(a/100)%10;
	
	public int Op(){
	
     if(b>=c & b>d || b>c & b>=d)
         System.out.println(" Number: "+ a +"\n The largest numeral: " + b);
     
     else 
         if (c>b & c>=d) 
             System.out.println(" Number: "+ a +"\n The largest numeral: " + c);
         
         else 
             System.out.println(" Number: "+ a +"\n The largest numeral: " + d);
         
    return 0; 
	}
	}
}
 
	
	
	
	
	 