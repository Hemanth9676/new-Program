package Arrayrs23;

public class Samedata {

	public static void main(String[] args) {
      int[] a1= {10,20,30,40,50};
      int[] a2= {10,30,50,70};
      for(int i=0;i<=a1.length-1;i++)
      {
    	  for(int j=0;j<=a2.length-1;j++)
    	  {
    		  if(a1[i]==a2[j])
    		  {
    			  System.out.println("the common elements "+a1[i]);
    		  }
    	  }
      }
	}

}
