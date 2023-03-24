package Arrays21;

import java.util.Scanner;

public class Occurance2nd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int count=0;
        int[] a= {10,20,30,40,50,30};
        int i=0;
        boolean flag=true;
        for(i=0;i<=a.length-1;i++) {
        	if(a[i]==n)
        	{
        		count++;
        	}
        		if(count==2)
            	{
            		flag=false;
            		break;
            }

        	}
        if(flag==false)
        {
        	System.out.println(i);
        	
        }
                   
	}

}
