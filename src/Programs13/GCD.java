   package Programs13;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {



		     Scanner scn=new Scanner(System.in);
		     System.out.println("Enter 2 num");
		     int num1=scn.nextInt();
		     int num2=scn.nextInt();
		     int gcd=1;
		     for(int i=1;i<=num1 && i<=num2;i++)
		     {
		    	 if(num1%i==0 && num2%i==0)
		    	 {
		    		 gcd=i;
		    	 }
		     }
		     System.out.println("Gcd is"+gcd);
			}

		

	}


