package com.calculatorapp.com;

import com.util.com.Utility;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("CalculatorApp Running");
		Utility util = new Utility();
		int add = util.addition(1, 2, 3);
		System.out.println("Addition" + "=" + add);
		int sub = util.substraction(12, 10, 40);
		System.out.println("Substraction" + "=" + sub);
		int mul = util.multifiation(90, 10, 20);
		System.out.println("Multifiation" + "=" + mul);
		int div = util.dividation(500, 200, 10);
		System.out.println("Dividation" + "=" + div);

	}

}
