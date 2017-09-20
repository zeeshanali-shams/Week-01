package com.zeeshan.interface1;

import java.util.Scanner;

public class mult implements interface1
{
	public void f1(int a) {
		int y;
		y=a*10;
		System.out.println("The value of f1 is "+y+".");
		
		
	}

	




	public static void main(String[] args)
	{
		mult s=new mult();
		System.out.println("Enter the values of the the variables");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		s.f1(a);
		
	}

	
	
}

