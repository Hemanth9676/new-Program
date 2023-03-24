package Programs13;

public class FactorialRange {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)

		{
			int fact=1;
//			int n=i;
			for(int j=i;j>=1;j--)
			{
				fact=fact*j;
			}
			System.out.println("factorial of range is"+fact );

		}
	}

}
