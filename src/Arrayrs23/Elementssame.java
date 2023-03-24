package Arrayrs23;

public class Elementssame {

	public static void main(String[] args) {
      //two arrays element same are not
		int[] a= {10,20,30,40,50};
		int[] b= {1,20,30,40,10};
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
					System.out.println("its present in array"+a[i]);
					
					break;
				}
			
//				else
//				{
//					System.out.println("no present"+a[i]);
//				}
			}
		}
		
		
	}

}
