package Arrays21;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a values");
      int a1=scn.nextInt();
      int a2=scn.nextInt();
      int a3=scn.nextInt();
      int a4=scn.nextInt();
      int[] a=new int[4];
      a[0]=a1;
      a[1]=a2;
      a[2]=a3;
      a[3]=a4;
        
        for(int i=1;i<a.length;i++)
        {
        	if(a[i]%2!=0)
        	{
        		System.out.println("is prime "+a[i]);
        	}
        	else
        	{
        		System.out.println(a[i]+"not prime");
        	}
        }
	}

}
