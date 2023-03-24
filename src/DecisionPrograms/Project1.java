package DecisionPrograms;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Create a Account");
       System.out.println("****************");
       
       System.out.println("Enter Your Name:");
       String name=scn.next();
       
       System.out.println("Enter a Your Email:");
       String email=scn.next();
       
       System.out.println("Enter Your Mobile Number:");
       long mobile=scn.nextLong();
       
       System.out.println("Enter a Password:");
       String pass=scn.next();
       
       System.out.println("Account Created Successfull.....");
       
       System.out.println("Enter Your Email:");
       String s1=scn.next();
       
       System.out.println("Enter Your Password");
       String s2=scn.next();
       
       if(email==s1 && pass==s2)
       {
    	  
    		   System.out.println("Login Successfully:");
       }
//    	   else
//    	   {
//    		   System.out.println("Your Password Should not Matched");
//    	   }
       
      
       System.out.println("Avalible Restarents");
       System.out.println("*********************************");
       
       System.out.println("Wood Land");
       System.out.println("*********************************");
       
       System.out.println("Aditya Grand");
       System.out.println("*********************************");
       
       System.out.println("Vishnu Grand");
       System.out.println("*********************************");
       
       System.out.println("Udipi");
       System.out.println("*********************************");
       
       System.out.println("Surya Grand");
       System.out.println("*********************************");
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Your Favarate Restrarent");
       
       String res=sc.next();
       
       
      
       int Dish = 0;
       
       switch(res)
       {
       case "Wood Land":
    	   System.out.println("Dum Biryani,Chikken Biryani,Matton Biryani,Fry Chicken Biryani,Frans  Biryani");
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a Dish:");
       int dish=scn.nextInt();
    	   switch(dish)
    	   {
    	   case 1:
    	     System.out.println("Cost of  Dum Biryani 300");
    	     break;
    	     
    	   case 2:
    		   System.out.println("Cost of Chikken Biryani 400 ");
    		   break;
    		   
    	   case 3:
    		   System.out.println("Cost of Matton Biryani 600");
    		   break;
    		   
    	   case 4:
    		   System.out.println("Cost of Fry Chicken Biryani 500");
    		   break;
    		   
    	   case 5:
    		   System.out.println("Cost of Frans  Biryani 700");
    		   break;
    		   default: System.out.println("Choose Correct Once");
    		   
    		   
    		   
    		   
    	   }
       }
       switch(res)
       {
       case "Aditya Grand":
    	   System.out.println("Dum Biryani,Chikken Biryani,Matton Biryani,Fry Chicken Biryani,Frans  Biryani");
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter a Dish:");
           int dish1=scn.nextInt();
    	   
       
    	   switch(dish1)
    	   {
    	   case 1:
    	     System.out.println("Cost of Dum Biryani 300");
    	     break;
    	     
    	   case 2:
    		   System.out.println("Cost of Chikken Biryani 400 ");
    		   break;
    		   
    	   case 3:
    		   System.out.println("Cost of Matton Biryani 600");
    		   break;
    		   
    	   case 4:
    		   System.out.println("Cost of Fry Chicken Biryani 500");
    		   break;
    		   
    	   case 5:
    		   System.out.println("Cost of Frans  Biryani 700");
    		   break;
    		   default: System.out.println("Choose Correct Once");
    		   
    		   
    		   
    		   
    	   }
       }
       switch(res)
       {
       case "Vishnu Grand":
    	   
    	   System.out.println("Dum Biryani,Chikken Biryani,Matton Biryani,Fry Chicken Biryani,Frans  Biryani");
           Scanner scann=new Scanner(System.in);
           System.out.println("Enter a Dish:");
           int dish2=scn.nextInt();
    	   switch(dish2)
    	   {
    	   case 1:
    	     System.out.println(" Cost of Dum Biryani 300");
    	     break;
    	     
    	   case 2:
    		   System.out.println("Cost of Chikken Biryani 400 ");
    		   break;
    		   
    	   case 3:
    		   System.out.println("Cost of Matton Biryani 600");
    		   break;
    		   
    	   case 4:
    		   System.out.println("Cost of Fry Chicken Biryani 500");
    		   break;
    		   
    	   case 5:
    		   System.out.println("Cost of Frans  Biryani 700");
    		   break;
    		   default: System.out.println("Choose Correct Once");
    		   
    		   
    		   
    		   
    	   }
       }
       switch(res)
       {
       case "Udipi":
    	   System.out.println("Dum Biryani,Chikken Biryani,Matton Biryani,Fry Chicken Biryani,Frans  Biryani");
           Scanner scann=new Scanner(System.in);
           System.out.println("Enter a Dish:");
           int dish3=scn.nextInt();
    	   
       
    	   switch(dish3)
    	   {
    	   case 1:
    	     System.out.println(" Cost of Dum Biryani 300");
    	     break;
    	     
    	   case 2:
    		   System.out.println("Cost of Chikken Biryani 400 ");
    		   break;
    		   
    	   case 3:
    		   System.out.println("Cost of Matton Biryani 600");
    		   break;
    		   
    	   case 4:
    		   System.out.println("Cost of Fry Chicken Biryani 500");
    		   break;
    		   
    	   case 5:
    		   System.out.println("Cost of Frans  Biryani 700");
    		   break;
    		   default: System.out.println("Choose Correct Once");
    		   
    		   
    		   
    		   
    	   }
       }
       switch(res)
       {
       case "Surya Grand":
    	   System.out.println("Dum Biryani,Chikken Biryani,Matton Biryani,Fry Chicken Biryani,Frans  Biryani");
           Scanner scann=new Scanner(System.in);
           System.out.println("Enter a Dish:");
           int dish4=scn.nextInt();
    	   
       
    	   switch(dish4)
    	   {
    	   case 1:
    	     System.out.println(" Cost of Dum Biryani 300");
    	     break;
    	     
    	   case 2:
    		   System.out.println("Cost of Chikken Biryani 400 ");
    		   break;
    		   
    	   case 3:
    		   System.out.println("Cost of Matton Biryani 600");
    		   break;
    		   
    	   case 4:
    		   System.out.println(" Cost of Fry Chicken Biryani  500");
    		   break;
    		   
    	   case 5:
    		   System.out.println("Cost ofFrans  Biryani 700");
    		   break;
    		   default: System.out.println("Choose Correct Once");
    		   
    		   
    		   
    		   
    	   }
       }
       
	}

}
