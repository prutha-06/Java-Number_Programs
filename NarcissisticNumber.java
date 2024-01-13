//Narcissistic Number is a number that is the sum of its own digits each 
//raised to the power of the number of digits
package com.practiceNumberProgram;

public class NarcissisticNumber {

	public static void main(String[] args) {
		int n = 1634;
		int temp = n;
		int n1 = temp;
		int rem;
		int sum = 0;
		int count = 0;
		double cube;
		while (n > 0) {
			rem = n % 10;
			count++;
			n = n / 10;
		}
		while (n1 > 0) {
			rem = n1 % 10;
			cube = Math.pow(rem, count);
			sum = (int) (sum + cube);
			n1 = n1 / 10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a Narcissistic number");
		}else {
			System.out.println(temp+" is Not Narcissistic number");
		}
	}

}
