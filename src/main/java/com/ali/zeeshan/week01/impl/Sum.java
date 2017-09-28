package com.ali.zeeshan.week01.impl;

import com.ali.zeeshan.week01.iface.Function;

<<<<<<< HEAD
/**
 * This class will work as a method to perform addition.
=======
/**This class will work as a method to perform addition.
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310
 */
public class Sum implements Function {
	/**
	 * This is the unary method
	 */
	public int compute(int a) {
<<<<<<< HEAD
		return a;
=======
		return a + 10;
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310
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
<<<<<<< HEAD
		return compute(a, b) + c;
=======
		return a + b + c;
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310
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
