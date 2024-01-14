//WAP to Display Fibonacci series up to a given 
package com.practiceNumberProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int n = 10;
		int next = 0;
		if (n == 1) {
			System.out.println(first);
		} else if (n == 2) {
			System.out.println(first + " " + second);
		} else {
			System.out.print(first + " " + second);
			for (int i = 3; i <= n; i++) {
				next = first + second;
				first = second;
				second = next;

				System.out.print(" " + next);
			}
		}
	}

}
