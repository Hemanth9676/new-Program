package Arrays21;

import java.util.Scanner;

public class CountMatchingIndex {

	public static void main(String[] args) {
		int count=0;
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int n=scn.nextInt();
       int[] a= {10,20,30,20,40,20,20};
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
