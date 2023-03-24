package Arrays21;

public class ReversearraySwap {

	public static void main(String[] args) {
       int[] a= {50,40,30,20,10};
       int i=0,j=0,temp;
       System.out.println("Before");
       for(int index=0;index<a.length;index++)
       {
    	   System.out.println(a[index]);
       }
       System.out.println();
       
       for(i=0,j=a.length-1;i<j;i++,j--)
       {
    	   temp=a[i];
    	   a[i]=a[j];
    	   a[j]=temp;
       }
       System.out.println("After");
       for(int index=0;index<a.length;index++)
       {
    	   System.out.println(a[index]);
       }
	}
	

}
