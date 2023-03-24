package Arrays21;

public class MinValueOfArray {

	public static void main(String[] args) {
		 int[] a= {10,20,50,60,150,70,100};
	      
	      int min=a[0];
	      for(int i=0;i<=a.length-1;i++)
	      {
	    	  if(a[i]<min)   min=a[i];
	      }
	      System.out.println(min+" Min value is");
	}

}
