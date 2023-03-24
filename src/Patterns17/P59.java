package Patterns17;

public class P59 {

	public static void main(String[] args) {
		 int n=5;
	      
	       for(int i=0;i<n;i++)
	       {
	    	   char ch='a';
	    	   for(int j=(-n)+1;j<n;j++)
	    	   {
	    		   int a=j;
	    		   if(a<0) a=-a;
	    		   
	    		   if(i>=a) {
	    			   
	    		   System.out.print(ch);
	    		   ch++; 
	    		   } 
	    	    else
	    	    	{
	    	    	System.out.print(" ");
	    	    	}
	    			   
	    		   }
	    	   System.out.println();
	       }
	    	   
		}
}

		

	


