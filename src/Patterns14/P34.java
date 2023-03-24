package Patterns14;

public class P34 {

	public static void main(String[] args) {
       int n=5;
       for(int i=1;i<=n;i++)
		{
			int count=5;
			for(int j=n;j>=1;j--)
			{
				if(j<=i)
				{
					System.out.print(count +" ");
					count--;
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		
       }
	}

}
