package Patterns17;

public class Hemanth {

	public static void main(String[] args) {
		 int n=5;
		 
		 for(int i=1;i<=n;i++)
		       {
		    	   for(int j=1;j<=n;j++)
		    	   {
		    		   if(j==1 && i<n/2+1 || i-j==n/2 || i+j==n+n/2+1 || j==n && i<=n/2+1)
		    		   {
		    			   System.out.print("*");
			    		   }
			    		   else
			    		   {
			    			   System.out.print(" ");
			    		   }
			    	   }
                        System.out.print("  ");		 
		    	   for(int j=1;j<=n;j++)
		    	   {
		    		   if(i==1 || j==1 || j==n || i==(n+2)/2)
		    		   {
		    			   System.out.print("*");
			    		   }
			    		   else
			    		   {
			    			   System.out.print(" ");
			    		   }
			    	   }
		    	   System.out.print("  ");	
		 
	    	   for(int j=1;j<=n;j++)
	    	   {
	    		   if(j==1 || j==n || i==j)
	    		   {
	    			   System.out.print("*");
		    		   }
		    		   else
		    		   {
		    			   System.out.print(" ");
		    		   }
		    	   }
	             

		       System.out.print(" ");
		   for(int j=1;j<=n;j++)
	    	   {
	    		   if(i==1 || i==n || j==n/2+1)
	    		   {
	    			   System.out.print("*");
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
	       
	
