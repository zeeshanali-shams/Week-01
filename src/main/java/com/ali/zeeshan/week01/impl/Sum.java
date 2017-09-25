package com.ali.zeeshan.week01.impl;

/*This class will work as a method to perform addition.
 */
public class Sum {
	// unary
	int compute(int a) {
		return a + 10;
	}

	// binary
	int compute(int a, int b) {
		return a + b;
	}

	// ternary
	int compute(int a, int b, int c) {
		return a + b + c;
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
