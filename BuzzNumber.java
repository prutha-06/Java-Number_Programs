//Numbers that are divisible by 7 or end with 7.
//For example, 57 is a buzz number because the number ends with seven. 
//Another example is 28 because the number is divisible by seven.

package com.practiceNumberProgram;

public class BuzzNumber {

	public static void main(String[] args) {
		int n=57;
		if(n%7==0 ||n%10==7) {
			System.out.println("Buzz number");
		}else {
			System.out.println("Not a Buzz Number");
		}
	}

}
