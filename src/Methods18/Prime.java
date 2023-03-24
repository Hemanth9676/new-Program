package Methods18;

public class Prime {
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{	
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
				{
				return false;
				}	
	}
		return true;	
	}	 
	public static long factorial(int n)
	{
       int fact=1;
       for(int i=1;i<=n;i++)
       {
    	   fact=fact*i;
       }
	return fact;
		
	}
	public static void fib(int n)
	{
		int a=0,b=1,c;
		for( int i=1;i<=n;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	
	}
	public static void main(String[] args) {
		System.out.println(isPrime(3));
		System.out.println("***************************");
		System.out.println(factorial(5));
		System.out.println("********************************");
	    fib(10);
       
	}

}
