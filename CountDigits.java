//WAP to Count Number of Digits in an Integer
package com.practiceNumberProgram;

public class CountDigits {

	public static void main(String[] args) {
		int n=12345;
		int rem=0;
		int count=0;
		while(n>0) {
	    rem=n%10;
		count++;
		n=n/10;
		}
		System.out.println(count+" digits are present in a number.");
	}

}
