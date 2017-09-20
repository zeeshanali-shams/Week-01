
package com.zeeshan.interface1;
import java.util.Scanner;

public class add implements interface1
{

	

	public void f3(int a, int b, int c) {
		int x;
		x=a+b+c;
		System.out.println("The value of f2 is"+x+".");
	}

	



	public static void main(String[] args)
	{
		add m=new add();
		System.out.println("Enter the values of the the variables");
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int a=sc.nextInt();
		int c=sc.nextInt();
		m.f3(a, b, c);
		
	}

}
