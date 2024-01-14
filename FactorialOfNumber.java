//WAP to Find Factorial of a Number
package com.practiceNumberProgram;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int n = 5;
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of "+n+" is= "+factorial);

	}

}
