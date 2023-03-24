  package NumbersPrograms;

import java.util.Scanner;

public class Fibi {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=scn.nextInt();
       
       int a=0,b=1,c;
       for(int i=0;i<num;i++)
       {
    	   System.out.println(a+" ");
    	   c=a+b;
    	   a=b;
    	   b=c;
    	   
       }
	}

}
