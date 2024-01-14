//A special two-digit number is such that when the sum of its  digits is 
//added to the product of its digits, the result is equal to the original two-digit number.
package com.practiceNumberProgram;

public class Special2DigitNumber {

	public static void main(String[] args) {
		int n = 19;
		int first = n / 10;
		int last = n % 10;

		int sum = first + last;
		int product = first * last;
		int finalSum = sum + product;
		if (finalSum == n) {
			System.out.println(n+" is a Special 2 digit number");
		} else {
			System.out.println(n+" is Not a special 2 digit number");
		}
	}
}
