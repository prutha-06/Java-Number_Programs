package com.practiceNumberProgram;

public class PronicNumber {

	public static void main(String[] args) {
		int n=10;
		int ans=0;
		for(int i=0; i<=20; i++) {
			if(i*(i+1)==n) {
				ans=1;
				break;
			}
		}
		if(ans==1) {
			System.out.println("pronic");
		}else {
			System.out.println("non pronic");
		}
	}

}
