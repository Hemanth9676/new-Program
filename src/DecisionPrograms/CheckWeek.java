package DecisionPrograms;

import java.util.Scanner;

public class CheckWeek {

	private static final String Monday = null;
	private static final String Tuesday = null;
	private static final String tharsday = null;
	private static final String wensday = null;
	private static final String friday = null;

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a day");
        String s=scn.next();
        
        
		if(s==Monday ||s==Tuesday||s==wensday||s==tharsday||s==friday)
        {
			System.out.println("its weekday");
        	
        }
		else
		{
			System.out.println("its weekend");
		}
	}

}
