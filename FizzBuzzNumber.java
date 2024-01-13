//Say Fizz if the number is divisible by 3.
//Say Buzz if the number is divisible by 5.
//Say FizzBuzz if the number is divisible by both 3 and 5.
//Return the number itself, if the number is not divisible by 3 and 5

package com.practiceNumberProgram;

public class FizzBuzzNumber {

	public static void main(String[] args) {
		int n=15;
		if(n%3==0 && n%5==0 ) {
			System.out.println("FizzBuzz");
		}else if(n%5==0) {
			System.out.println("Buzz");
		}else if(n%3==0) {
			System.out.println("Fizz");
		}else {
			System.out.println(n);
		}
		
	}

}
