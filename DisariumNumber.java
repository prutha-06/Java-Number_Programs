//Sum of its digits powered with their respective 
//position is equal to the original number. As 1^1+3^2+5^3 = 135
package com.practiceNumberProgram;

public class DisariumNumber {

	public static void main(String[] args) {
		int n=89;double cb=0.0;
		int temp=n;
		int n1=n;
		int count=0;
	
		while(n>0) {
			int rem=n%10;
			count++;
			n=n/10;
		}
		while(n1>0) {
			int rem1=n1%10;
			cb=cb +Math.pow(rem1, count);
			
			count--;
			n1=n1/10;
			
		}
		if(temp==cb) {
			System.out.println(temp+" is a Disarium number.");
		}else {
			System.out.println(temp+" is not a Disarium number.");

		}
	}

}
