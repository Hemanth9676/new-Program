package Arrays21;

import java.util.Scanner;

public class Prodindex {
	 static int prod=1;


	public static void main(String[] args) {
		
	
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a size");
		int size=scn.nextInt();
		int[] a=new int[size];
		System.out.println("Enter a numbers");
		for(int i=0;i<size;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				prod*=a[i];
			}
				
			}
		System.out.println(prod);

	}

}
