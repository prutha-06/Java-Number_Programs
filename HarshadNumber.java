//A number is said to be the Harshad number if it is divisible 
//by the sum of its digit.
package com.practiceNumberProgram;

public class HarshadNumber {

	public static void main(String[] args) {
		int n = 156;
		int temp = n;
		int rem = 0;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		if (temp % sum == 0) {
			System.out.println(temp+" is a Harshad number");
		} else {
			System.out.println(temp+" is Not a Harshad Number");
		}
	}

}
