//WAP to find LCM of two given numbers.
package com.practiceNumberProgram;

public class LCMOfNumbers {

	public static void main(String[] args) {
		int n = 12;
		int m = 6;
		int gcd = 1;
		for (int i = 1; i <= n && i <= m; i++) {
			if (n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
		int lcm = (n * m) / gcd;
		System.out.println("LCM of "+n+" and "+m+" is= "+lcm);
	}

}
