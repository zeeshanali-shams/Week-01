package com.ali.zeeshan.week01.impl;

/*This class will work as a method to find lowest common multiple.
 */
public class LowestCommonMultiple {
	// unary
	int compute(int a) {
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

	}

	// binary
	int compute(int a, int b) {
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

	// ternary
	int compute(int a, int b, int c) {
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
		y = c;

		while (y != 0) {
			t = y;
			y = x % y;
			x = t;
		}

		lcm = (lcm1 * c) / x;
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
