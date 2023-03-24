package Recursion20;

public class Addfirst10 {
	public static int sum(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return(n+sum(n-1));
		}
	}

	public static void main(String[] args) {
           int n=10;
           System.out.println("The sum of first natural number"+sum(n));
	}

}
