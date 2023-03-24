package DecisionPrograms;

import java.util.Scanner;

public class InstagramLogin {

	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter a UserName");
         int user=scn.nextInt();
         System.out.println("Enter a Password");
         int pas=scn.nextInt();
         
//         int s1=123;
//         int pass=999;
         
         if(user==123)
         {
        	 if(pas==999)
        	 {
        		System.out.println("Login Successful"); 
        	 }
        	 else
        	 {
        		 System.out.println("Enter valid Password");
        	 }
         }
         else
         {
        	 System.out.println("Enter Valid User Name");
        	
        	 
        		 
        	 
         }
	}

}
