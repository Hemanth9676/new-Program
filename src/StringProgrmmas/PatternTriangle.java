package StringProgrmmas;

public class PatternTriangle {
public static void main(String[] args) {
	int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=(-n)+1;j<n;j++)
		{
			int a=j;
			if(a<0) a=-a;
			if(i>=a)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
