package Patterns17;

public class P62 {

	public static void main(String[] args) {
     
     int n=5;
     for(int r=1;r<=n;r++)
     {
    	 int p=0;int temp=4;
    	for(int c=1;c<=r;c++)
    	{
    		if(c==1)
    		{
    			System.out.print(r+" ");
    			p=r+temp;
    		}
    		else
    		{
    			System.out.print(p+" ");
    		 	temp--;
    			p=p+temp;
    		}
    	}
    	System.out.println();
     }
	}

}
