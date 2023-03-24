package Assignment11;

import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Ener a Year");
    int y=scn.nextInt();
    
//    if((y%400==0) || (y%4==0  && y%100!=0) )
    if(y%400==0 || y%4==0)
{
	System.out.println("Leep Year");
}
    else if(y%100!=0) 
    	{
    	System.out.println("Not Leep Year");
    	}
       

	}
	
}
