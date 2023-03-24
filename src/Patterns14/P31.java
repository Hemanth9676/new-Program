package Patterns14;

import java.util.Scanner;

public class P31 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=scn.nextInt();
       
       for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>=1;j--)
			{
				if(j<=i)
				{
					System.out.print(i+" ");
		
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
       }
	}


