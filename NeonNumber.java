package com.practiceNumberProgram;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9; int sum=0;
		 int sq;int rem; int temp=n;
		 sq=(int) Math.pow(n, 2);
		 while(sq>0) {
		 rem=sq%10;
		 sum=sum+rem;
		 sq=sq/10;
		 }
		 if(sum==temp) {
		 System.out.println(temp+" is Neon Number");
		 }else {
		 System.out.println(temp+" is Not Neon Number");
		 }

	}

}
