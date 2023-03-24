package Recursion20;

public class Fibinacci {
	static int a=0,b=1,c,N=0;
	public static int fibi(int n)
	{
		N++;
		
		a=b;
		b=c;
		c=a+b;
		
		if(N>=n) return n;
		else 
		 return fibi(n);
		
	}
		
     
	public static void main(String[] args) {
        fibi(5);
        System.out.println(c);
	}

}
