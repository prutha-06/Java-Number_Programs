//WAP to Check Armstrong Number
package com.practiceNumberProgram;

public class AmstrongNumber {

	public static void main(String[] args) {
		int n=371;
		int temp=n;
		int rem;
		int cube;
		int sum=0;
		while(n>0) {
			rem=n%10;
			cube=rem*rem*rem;//Math.pow(rem, 3);
			sum=sum+cube;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is an Amstrong number");
		}else {
			System.out.println(temp+" is not an Amstrong number");
		}
	}

}
