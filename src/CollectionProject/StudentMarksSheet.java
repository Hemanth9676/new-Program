package CollectionProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentMarksSheet {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("enter the subjectS pu1");
		
		int [] d=new int[5];
		LinkedList ll=new LinkedList();
		for(int i=0;i<d.length;i++)
		{
			String s=Sc.next();
			ll.add(s);
		}
		

	   System.out.println("enter the subjectS pu2");
		
		int [] d1=new int[5];
		LinkedList l2=new LinkedList();
		for(int i=0;i<d.length;i++)
		{
			String s1=Sc.next();
			l2.add(s1);
		}
	 
	 

	if(l2.containsAll(ll))
	{
		System.out.println("same");
	}
	else
	{
		System.out.println("not same");
	}
	LinkedList l3=new LinkedList();

	l3.addAll(ll);
	l3.addAll(l2);
	System.out.println(l3);
		

		System.out.println(l3.size());

	}
	}