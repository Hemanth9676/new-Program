package Arrayrs23;

public class Secondmax {

	public static void main(String[] args) {
    int[] a= {110,70,100,54,67};
    int max1=a[0];
    int  max2=a[0];
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]>max1)
    	{
    		max2=max1;
    		max1=a[i];
    	}
    	else if(a[i]>max2 || max1==max2)
    	{
    		max2=a[i];
    	}
    }
    	System.out.println(max2);  		
    	
    }
	}


