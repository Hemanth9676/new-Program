package Recursion20;


public class Reverse {
	 static   int rev=0;
	  static   int rem;
		public static void main(String[] args) {
	       int n=56789;
	       System.out.println(reverse(n));
		}

		   public static int reverse(int n) {
	         if(n<=0) {return n;}
	         else {
	        	 rem=n%10;
	        	 rev=(rev*10)+rem;
	        	 n/=10;
	        	 reverse(n);
	        	 return rev;
	         }
		}

	}