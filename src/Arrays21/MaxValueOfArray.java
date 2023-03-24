 package Arrays21;

public class MaxValueOfArray {

	public static void main(String[] args) {
      int[] a= {10,20,50,60,150,70,100};
      
      int max=a[0];
      for(int i=1;i<=a.length-1;i++)
      {
    	  if(a[i]>max)   max=a[i];
      }
      System.out.println(" Max value is "+max);
	}

}
