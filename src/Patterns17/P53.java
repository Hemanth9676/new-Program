package Patterns17;

public class P53 {

	public static void main(String[] args) {
      int n=5;
      for(int i=(-n)+1;i<n;i++)
      {
    	  int a=i;
    	  if(a<0) a=-a;
    	  a=a-(n-1);
    	  if(a<0) a=-a;
    	  for(int j=n-1;j>=0;j--)
    	  {
    		  if(a>=j)
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
