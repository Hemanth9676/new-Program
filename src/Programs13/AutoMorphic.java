package Programs13;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a value");
       int num=scn.nextInt();
       
       int sq=num*num;
       boolean flag=true;
       while(num>0)
       {
    	   if(num%10==sq%10) {
    		   num/=10;
    	       sq/=10;
    	   }
    	   else
    	   {
    		   flag=false;
    		   break;
    	   }
       }
       if(flag)
       {
    	  
       System.out.println("AutoMorphic");
       
	}else
	{
		System.out.println("Not AutoMorphic");
	}

}
}