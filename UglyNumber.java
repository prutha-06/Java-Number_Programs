//A number is said to be an Ugly number if positive 
//numbers whose prime factors only include 2, 3, 5
package com.practiceNumberProgram;

public class UglyNumber {

	public static void main(String[] args) {
		int n = 15;
		isUglyNumber(n);
	}

	public static void isUglyNumber(int n) {
		int temp=n;
		while (n != 1) {
			if (n % 5 == 0) {
				n = n / 5;
			} else if (n % 3 == 0) {
				n = n / 3;
			} else if (n % 2 == 0) {
				n = n / 2;
			} else {
				System.out.println(temp+" is not an ugly number.");
				return;
			}
		}
		System.out.println(temp+" is an ugly number.");
	}


}
