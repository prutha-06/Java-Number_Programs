//WAP to Check Leap Year
package com.practiceNumberProgram;

public class CheckLeapYear {

	public static void main(String[] args) {
		int year=100;
		if(year%100==0 && year%400==0 || year%4==0) {
			System.out.println(year+" is a leap year");
			
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}
