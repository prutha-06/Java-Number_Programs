//Starting with any positive integer, replace the number by 
//the sum of the squares of its digits, and repeat the process 
//until the number equals 1, or it loops endlessly in a cycle 
//which does not include 1
package com.practiceNumberProgram;

public class HappyNumber {

	public static void main(String[] args) {
		int n = 19;
		int res = n;
		while (res != 1 && res != 4) {
			res = isHappy(res);
		}
		if (res == 1) {
			System.out.println(n+" is happy number");
		} else if (res == 4) {
			System.out.println(n+" is not happy number");
		}

	}

	static int isHappy(int n) {
		int rem = 0;
		int sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem);
			n = n / 10;
		}
		return sum;
	}
}
