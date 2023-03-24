package Forloop;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter 2 num");
//     int num1=scn.nextInt();
//     int num2=scn.nextInt();
//     int gcd=1;
//     for(int i=1;i<=num1 && i<=num2;i++)
//     {
//    	 if(num1%i==0 && num2%i==0)
//    	 {
//    		 gcd=i;
//    	 }
//     }
//     System.out.println("Gcd is"+gcd);
//	}
//
//}
    
     int a=3;
     int b=9;
//     int n=a>b?a:b;
//     while(true) {
//     if(a%n==0 && b%n==0) break;
//     n--;
//     }
//     System.out.println(n);
     int rem=0;
     while(b!=0)
     {
    	 rem=a%b;
    	 a=b;
    	 b=rem;
    	 if(b==0)
         {
        	 System.out.println(a);
         }
    	 
     }
     
	}
}
