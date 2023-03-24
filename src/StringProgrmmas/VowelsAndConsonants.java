package StringProgrmmas;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a String");
       String s=scn.next();
       char[] ch=s.toCharArray();
       char c1='a',c2='e',c3='i',c4='o',c5='u';
       for(int i=0;i<ch.length;i++)
       {
    	   if(ch[i]==c1 || ch[i]==c2 || ch[i]==c3 || ch[i]==c4 || ch[i]==c5)
    	   {
    		   System.out.println(ch[i]+" is Vowel");
    	   }
    	   else
    	   {
    		   System.out.println(ch[i]+" is Consonats");
    	   }
       }
       
	}

}
