package Arrayrs23;

public class SubArraysPrintAll {

	public static void main(String[] args) {
     int [] a= {1,2,3,4};
     int n=a.length;
     
     for(int i=0;i<n;i++)
     {
    	 for(int j=0;j<n-i;j++)
    	 {
    		 for(int k=i;k<=i+j;k++)
    		 {
    	   		 System.out.print(a[k]+" ");
    		 }
    		 System.out.println();
    	 }
     }
	}

}
//     int count=0;
//  for(int i=0;i<n;i++)
//  {
//	  for(int j=i;j<n;j++)
//	  {
//		System.out.print(a[j]+" ");
//	  }
//  }
////  System.out.println(count);
//	}
//}