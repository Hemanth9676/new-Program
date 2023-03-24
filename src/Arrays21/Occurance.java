package Arrays21;

import java.util.Scanner;

public class Occurance {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        int[] a= {10,20,30,30,30};
        
        int count=0;
        for(int i=0;i<=a.length-1;i++)
        {
        	if(a[i]==n)
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}

}
