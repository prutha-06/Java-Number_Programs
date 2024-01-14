//A number N will be a xylem number if the sum of its 
//extreme (ﬁrst and last) digits is equal to the sum of 
//mean (all digits except ﬁrst and last) digits. If the 
//sum of extreme digits is not equal to the sum of mean digits, the number is called phloem number.
package com.practiceNumberProgram;

public class XylemAndPhloemNumber {

	public static void main(String[] args) {
		 int num = 34326;
			int n=num;
			int lastsum = 0;
			int middlesum = 0;
			
			while (n > 0) {
				if (n == num || n < 10) {
					lastsum = lastsum + n % 10;
				} else {
					middlesum = middlesum + n % 10;
				}
				n = n / 10;
			}
			System.out.println("last digits sum=" + lastsum);
			System.out.println("middle digits numbers sum=" + middlesum);
			if (lastsum == middlesum) {
				System.out.println(num+" is xylem");
			} else {
				System.out.println(num+" is phloem");
			}

	}

}
