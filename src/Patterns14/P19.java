package Patterns14;

public class P19 {

	public static void main(String[] args) {
      
		for(int i=1;i<=5;i++)
		{
			char ch='Z';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
       }
	}

}
