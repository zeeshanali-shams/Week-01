package com.ali.zeeshan.week01.impl;

import com.ali.zeeshan.week01.iface.Function;

<<<<<<< HEAD
/**
 * This class will work as a method to find lowest common multiple.
=======
/**This class will work as a method to find lowest common multiple.
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310
 */
public class LowestCommonMultiple implements Function {
	/**
	 * This is the unary method
	 */
	public int compute(int a) {
<<<<<<< HEAD
		return a;
=======
		int x, y, t, lcm;
		x = a;
		y = 15;

		while (y != 0) {
			t = y;
			y = x % y;
			x = t;
		}

		lcm = (a * 15) / x;
		return lcm;
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310

	}

	/**
	 * This is the binary method
	 */
	public int compute(int a, int b) {
		int x, y, t, lcm;
		x = a;
		y = b;

		while (y != 0) {
			t = y;
			y = x % y;
			x = t;
		}

		lcm = (a * b) / x;
		return lcm;
	}

	/**
	 * This is the ternary method
	 */
	public int compute(int a, int b, int c) {
<<<<<<< HEAD
		int x, y, t, lcm;
		x = compute(a, b);
=======
		int x, y, t, lcm1, lcm;
		x = a;
		y = b;

		while (y != 0) {
			t = y;
			y = x % y;
			x = t;
		}

		lcm1 = (a * b) / x;

		x = lcm1;
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310
		y = c;

		while (y != 0) {
			t = y;
			y = x % y;
			x = t;
		}

<<<<<<< HEAD
		lcm = (compute(a, b) * c) / x;
=======
		lcm = (lcm1 * c) / x;
>>>>>>> 1a7965f8eee849cc755293a30ef2f564c654b310
		return lcm;

	}

	public static void main(String[] args) {

		LowestCommonMultiple o = new LowestCommonMultiple();
		int a = 25;
		int b = 10;
		int c = 40;
		System.out.println("The lcm according to the three methods are "
				+ o.compute(a) + ", " + o.compute(a, b) + " and "
				+ o.compute(a, b, c));
	}

}
