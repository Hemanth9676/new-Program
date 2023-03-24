package StringProgrmmas;

import java.util.Scanner;

public class DuplicatesWords {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.nextLine();

		String[] s2=s1.split(" "); 
		int count=1;
		for(int i=0;i<=s2.length-1;i++)
		{
			for(int j=i+1;j<s2.length;j++)
			{
				if(s2[i].equals(s2[j]) && s2[i]!=" ")
				{
					s2[j]=" ";
					count++; 
				}
			}
			if(count>=1 && s2[i]!=" ")
			{
				System.out.println(s2[i]+"="+count);
				s2[i]=" ";
			}
			count=1;
		}
	}
}
	