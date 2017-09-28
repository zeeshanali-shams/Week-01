package com.ali.zeeshan.week01.impl;

import com.ali.zeeshan.week01.iface.Function;

/*This class will work as a method to perform multiplication.
 */
public class Product implements Function {
	/*
	 * This is the unary method
	 */
	public int compute(int a) {
		return a * 10;
	}

	/*
	 * This is the binary method
	 */
	public int compute(int a, int b) {
		return a * b;
	}

	/*
	 * This is the ternary method
	 */
	public int compute(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {

		Product n = new Product();
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("The product according to the three methods are "
				+ n.compute(a) + ", " + n.compute(a, b) + " and "
				+ n.compute(a, b, c));
	}
}
