package DecisionPrograms;

import java.util.Scanner;

public class StuMarks {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	     
	        
	        System.out.println("Enter a Maths marks");
	        int math=scn.nextInt();
	       
	        System.out.println("Enter a Physics marks");
	        int phy=scn.nextInt();
	       
	        System.out.println("Enter a Chemistry Marks");
	        int che=scn.nextInt();
	       
	        System.out.println("Enter a Java Marks");
	        int java=scn.nextInt();
	       
	        System.out.println("Enter a English Marks");
	        int eng=scn.nextInt();
	        
	        double sum=math+phy+che+java+eng;
	        System.out.println(sum);
	        
	        double per=sum/500*100;
	        System.out.println(per);
	         
	       
	        
	        if(per>90 && per<100)
	        {
	        	System.out.println("A grade");
	        }
	        else if(per>80 && per<90)
	        {
	        	System.out.println("B grade");
	        }
	        else if(per>70 && per<80)
	        {
	        	System.out.println("C grade");
	        }
	        else
	        {
	        	System.out.println("Fail");
	        }
	}

}
