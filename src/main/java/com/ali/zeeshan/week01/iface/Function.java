package com.ali.zeeshan.week01.iface;

/**
 * The interface has been created with the name Function. The interface has
 * three methods(unary, binary and ternary).
 */
public interface Function {

	/**
	 * This is the unary method
	 */
	public int compute(int a);

	/**
	 * This is the binary method
	 */
	public int compute(int a, int b);

	/**
	 * This is the ternary method
	 */
	public int compute(int a, int b, int c);

}
