package DecisionPrograms;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Score");
        int sco=scn.nextInt();
        
        if(sco<=1 && sco<=25)
        {
        	System.out.println("Bad Performance");
        }
        else if(sco>25 && sco<=50)
        {
        	System.out.println("Good Performance");
        }
        else if(sco>=50 && sco<=80)
        {
        	System.out.println("Very Good Performance");
        }
        else
        {
        	System.out.println("Amazing Performance");
        }
	}

}
