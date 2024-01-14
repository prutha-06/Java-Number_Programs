//An automorphic number is a number whose square 
//"ends" in the same digits as the number itself.
package com.practiceNumberProgram;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int n = 5;
		int rem;
		int sq = (int) Math.pow(n, 2);
		rem = sq % 10;
		if (rem == n) {
			System.out.println(n+" is an Automorphic Number");
		} else {
			System.out.println(n+" is Not a Automorphic number");
		}
	}

}
