package Recursion20;

public class Strong {
	static int sum=0;
	public static void main(String[] args) {
     System.out.println(strong(145));
	}
    
	static int strong(int n) {
		while(n>0) {
		int rem=n%10;
		int =fact*(rem);
		sum+=fact;
		n/=10;
		}
		return sum;
	}
}
