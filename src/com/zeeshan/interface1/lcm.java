package com.zeeshan.interface1;
import java.util.Scanner;

public class lcm implements interface1
{
	public void f2(int x,int y)
	{
		int a=0,b=0,t,lcm;
		 a = x;
	        b = y;
			
	        while(b != 0)
	        {
	            t = b;
	            b = a%b;
	            a = t;
	        }
			
	        
	        lcm = (x*y)/a;
	        System.out.println("The LCM of the numbers is "+lcm+".");
	}
	
	
	public static void main(String[] args)
	{
		lcm e= new lcm();
		System.out.println("Enter the values of the variables");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		e.f2(x, y);
	}
}

