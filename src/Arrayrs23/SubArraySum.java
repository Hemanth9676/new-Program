 
package Arrayrs23;

public class SubArraySum {

	public static void main(String[] args) {
    int[] a= {1,2,3};
    int n=a.length;
    int sum=0;
    for(int i=0;i<n;i++)
    {
    	int temp=0;
    	for(int j=i;j<n;j++)
    	{
    		temp+=a[j];
    		sum+=temp;
    	} 
    	
    }
    System.out.println(sum);
	}

}
