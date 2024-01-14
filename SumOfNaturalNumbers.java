//WAP to find sum of N natural numbers.
package com.practiceNumberProgram;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int range = 5;
		int sum = 0;
		for (int i = 1; i <= range; i++) {
			sum = sum + i;
		}
		System.out.println("The sum of 1 to "+range+" is= "+sum);
	}

}
