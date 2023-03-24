package Recursion20;

public class EvenOddRange {
	public static int even(int n)
	{
		if(n<=0)
		{
			return n;
		}
		else if(n%2==0) System.out.println("even numbers are "+n);
		else {
			System.out.println("odd numbers are "+n);
		
		}
		even(n-1);
		return n;
	}

	public static void main(String[] args) {
		int n=10;
		System.out.println(even(n));
		
       
	}

}
