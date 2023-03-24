package TestYantraAllNumberProgramms;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a Number1");
    int n1=scn.nextInt();
    System.out.println("Enter a Number2");
    int n2=scn.nextInt();
    
    int temp = 1;
    for(int i=1;i<=n1 && i<=n2;i++)
    {
    	if(n1%i==0 && n2%i==0)
    	{
    	  temp=i;	
    	}
    }
    System.out.println("Gcd is "+temp);
    
	}

}
