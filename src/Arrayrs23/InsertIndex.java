 package Arrayrs23;

import java.util.Arrays;

public class InsertIndex {

	public static void main(String[] args) {
		int[] n= {1,2,3,5,6};
	      int[] n1=new int[n.length+1];
	      int ind=3;
	      int j=0;
	      int num=4;
	      for(int i=0;i<=n.length-1;i++)
	      {	
	    	if(ind==i)
	    	{
	    	  n1[j]=num;
	    		j++;
	    		
	    	}
	    	  n1[j]=n[i];
	    	  j++;
	      }
//	      for(int i=0;i<=n1.length-1;i++)
//	      {	
//	    	  System.out.println(n1[i]);
//	      }
//	      System.out.println(Arrays.toString(n1));
	      System.out.println(Arrays.toString(n1));
	      }

	}


