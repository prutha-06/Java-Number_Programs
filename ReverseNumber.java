//How to Reverse a Number in Java?
package com.practiceNumberProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		int n=1234;
		int rem, reverse=0;
		while(n>0) {
		rem=n%10;
		reverse=reverse*10+rem;
		n=n/10;
		}
		System.out.println("Reversed Number is= "+reverse);
	}

}
