package com.test.yantra;

public class Task9 {

	public static void main(String[] args) {
//          int x=1,y=2,z=5;
//          System.out.println(x==1 || x>y || x>z);
//          System.out.println(x==y || y==2 || z==5);
//          System.out.println(x==y || y==z || z==x);
		
//		
//		int x = 1, y = 2, z = 5; 
//		  System.out.println("x: " +(!((x + 2) == (1 + 2)))); 
//
//		  System.out.println("y: " +(!(y == z))); 
//		  System.out.println("z>x: " +(!(z > x))); 
//
//		  System.out.println(!(x == y) && ((y + 5) > z) && (!((z - 3) == 0)));
		
		
//		 int x = 20, y = 30, z = 50; 
//		    x += y; 
//		    y -= x + z; 
//		    z *= x * y;
//		 System.out.println("x = " +x ); 
//		 System.out.println("y = " +y ); 
//		 System.out.println("z = " +z ); 

//		 int x = y = z = 10;
//		  System.out.println(x + " " + y + " " + z);
		
//		   int x, y, z;
//		   x = y = z = 2;
//		   x += y;
//		   y -= z;
//		   z /= (x + y);
//		 System.out.println(x + " " + y + " " + z);
		
//		   int x, y, z;
//		   1 = x;
//		   y = z = 2;
//		  
//		   int a = x + y + z;
//		   System.out.println(x + " " + y + " " + z);
//		
		
//		double x = 10.5;
//		   x /= 4 + 2.5 * 2.5;
//		   System.out.println(x);
//		   
		   
//		int age=20;
//		System.out.println(age++);
		
//		int month=7;
//		month++;
//		System.out.println(month);
		  
//		int i=1,j=2,k=7;
//		int m=++i + j++ + ++k;
//		System.out.println(m);
		
//		int x=5,y=3,z=6;
//		int a=++x + ++y + z++;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		System.out.println(a);
		
//		int i=4;
//		int Output=i++ + ++i *5;
//		System.out.println(Output);

//		int x=5,y=-10,z=-20;
//		int n=x-- + y-- + z--;
//		System.out.println(n);
		
		int x=5,y=2,exp=10;
		exp%=x+(x>6?++y:--y);
		System.out.println(exp);
	}

}
