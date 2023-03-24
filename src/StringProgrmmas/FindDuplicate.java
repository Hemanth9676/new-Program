package StringProgrmmas;

import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = "";
		for (int i = 0; i < s1.length() - 1; i++) {
		char ch = s1.charAt(i);
		if (s2.indexOf(ch) == -1) 
		{
		int count = 0;
		for (int j = i + 1; j < s1.length(); j++) 
		{
		if (ch == s1.charAt(j)) 
		{
		count++;
		}}
		if (count >= 1) {
		System.out.print(ch +" "+count);
		System.out.println();
		}
		}
		s2 += ch; 
//		System.out.println(s2);
		}
//		System.out.println(s2);
		}
	}


