package com.practiceNumberProgram;

public class PallindromeNumber {

	public static void main(String[] args) {
		int n=1221;
		int rem; int reverse=0; int temp=n;
		while(n>0) {
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(temp==reverse) {
			System.out.println(temp+" is palindrome number");
		}else {
			System.out.println(temp+" is not a palindrome number");
		}

	}

}
