//WAP to find Factors of given number.
package com.practiceNumberProgram;

public class FactorsOfNumber {

	public static void main(String[] args) {
		int n=18;
		System.out.println("Factors of given number");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
