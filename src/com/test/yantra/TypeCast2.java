package com.test.yantra;

public class TypeCast2 {

	public static void main(String[] args) {
      
		short s=3;
		byte b=(byte)s;
		System.out.println(b);
		
		double d=2.0;
		int i=(int)d;
		System.out.println(i);
		
		float f=30.0f;
		byte b1=(byte)f;
		System.out.println(b1);
		
		float f1=20.0f;
		char c=(char)f1;
		System.out.println(c);
		
		int i1=1;
		char ch=(char)i1;
		System.out.println(ch);
		
		double d1=10.01;
		float f2=(float)d1;
		System.out.println(f2);
	}

}
