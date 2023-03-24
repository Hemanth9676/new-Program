package Patterns14;

public class Snippet {
	for(int i=1;i<=size;i++)
			{
				int count=5;
				for(int j=size;j>=1;j--)
				{
					if(j<=i)
					{
						System.out.print(count-- +" ");
					}
					else {
						System.out.print(" "+" ");
					}
					
				}
				System.out.println();
			}
}

