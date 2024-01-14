//Strontio numbers are those four digits numbers when 
//multiplied by 2 give the same digit at the hundreds and tens place
package com.practiceNumberProgram;

public class StrontioNumber {

	public static void main(String[] args) {
		int n = 1386;
		int result = 0;
		for (int i = 1; i <= n; i++) {
			int s = n * 2;
			if ((s % 1000)/100 == (s % 100)/10) {
				result = 1;
				break;
			}
		}
		if(result==1) {
			System.out.println(n+" is a Strontio numnber");
		}else {
			System.out.println(n+" is not a Strontio number");
		}
	}

}
