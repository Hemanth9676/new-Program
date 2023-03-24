package Patterns14;

import java.util.Scanner;

public class P28 {

	public static void main(String[] args) {
		  Scanner sc= new Scanner(System.in);
			System.out.println("Enter The Size..");
			int n=sc.nextInt();
		
			
			for(int i=n;i>=1;i--)
			{
				for(int j=n;j>=i;j--)
				{
					System.out.print(j+" ");
		        }
				System.out.println();
	      }
	   }
	}

	


