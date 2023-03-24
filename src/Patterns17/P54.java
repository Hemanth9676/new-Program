package Patterns17;

public class P54 {

	public static void main(String[] args) {
       int n=5;
       for(int i=0;i<n;i++)
       {
    	   for(int j=(-n)+1;j<n;j++)
    	   {
    		   int a=j;
    		   if(a<0) a=-a;
    		   if(i==a || i==(n-1))
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
