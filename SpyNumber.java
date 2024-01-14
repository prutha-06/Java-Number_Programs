//A spy number is a number where the sum of its 
//digits equals the product of its digits. 
package com.practiceNumberProgram;

public class SpyNumber {

	public static void main(String[] args) {
		 int n=1124;
			int rem = 0;
			int sum = 0;
			int product = 1;
			int temp = n;
			while (n > 0) {
				rem = n % 10;
				sum = sum + rem;
				product = product * rem;
				n = n / 10;
			}
			if (sum == product) {
				System.out.println(temp+" is a Spy number");
			} else {
				System.out.println(temp+" is not a spy number");
			}
	}

}
