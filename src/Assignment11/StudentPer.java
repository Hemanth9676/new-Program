  package Assignment11;

import java.util.Scanner;

public class StudentPer {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       
    		   System.out.println("Enter classes held: ");
       int a=scn.nextInt();
       
       System.out.println("Enter Number classes Attend");
       int b=scn.nextInt();
       
      float per=((b*100)/a); 
       System.out.println(per);
       
       if(per>75)
       {
    	   System.out.println("You allowed for Exam"+ per);
       }
       else
       {
    	   System.out.println("You are not allwoed for Exam"+ per);
       }
       
       
	}

}

