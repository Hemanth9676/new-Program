package Patterns17;

public class P58 {

	public static void main(String[] args) {
       int n=5;
       for(int i=0;i<n;i++)
       {
    	   for(int j=(-n)+1;j<n;j++)
    	   {
    		   int a=j;
    		   if(a<0) a=-a;
    		   if(i>=a)
    		   {
    			   if(i%2==0)
    		   {
    			   System.out.print("1");
    		   }
    		   else
    		   {
    			   System.out.print("0");
    		   }
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
