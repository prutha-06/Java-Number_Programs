//WAP to find HCF of two given numbers.
package com.practiceNumberProgram;

public class HcfOfNumber {

	public static void main(String[] args) {
		int a=12, b=16, hcf=1;
		for(int i=1; i<=a || i<=b; i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		System.out.println("The highest common factor is= "+hcf);
	}

}
