//A number is said to be Krishnamurthy if the factorial sum of all 
//its digits is equal to that number. Krishnamurthy number is also
//referred to as a Strong number
package com.practiceNumberProgram;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		int n = 145;
		if (checkNumIsKrishnamurthy(n)) {
			System.out.println(n+ " is a Krishnamurthy number");
		} else {
			System.out.println(n+" is not krishnamurthy number");
		}

	}

	static int factorial(int findfctnum) {
		int fct = 1;
		while (findfctnum > 0) {
			fct = fct * findfctnum;
			findfctnum--;
		}
		return fct;
	}

	static boolean checkNumIsKrishnamurthy(int num) {
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			sum = sum + factorial(temp % 10);
			temp = temp / 10;
		}
		if (sum == num) {
			return true;
		} else {
			return false;
		}
	}
}
