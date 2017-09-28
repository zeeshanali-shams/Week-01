package com.ali.zeeshan.week01.impl;

import com.ali.zeeshan.week01.iface.Function;

/**
 * This class will work as a method to perform addition.
 */
public class Sum implements Function {
	/**
	 * This is the unary method
	 */
	public int compute(int a) {
		return a;
	}

	/**
	 * This is the binary method
	 */
	public int compute(int a, int b) {
		return a + b;
	}

	/**
	 * This is the ternary method
	 */
	public int compute(int a, int b, int c) {
		return compute(compute(a, b), c);
	}

	public static void main(String[] args) {

		Sum m = new Sum();
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("The sum according to the three methods are "
				+ m.compute(a) + ", " + m.compute(a, b) + " and "
				+ m.compute(a, b, c));
	}
}
