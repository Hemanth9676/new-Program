package StringProgrmmas;

public class DistinctString {

	public static void main(String[] args) {
		String [] s1={"hello", "hello", "byee","byee","hello","rj","jhd"};
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(s1[i]);
			}
		}
	}
}

