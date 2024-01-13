//10.	WAP to find Largest of Three Numbers. 
//Using Ternary Operator
package com.practiceNumberProgram;

public class CompareNumsUsingTernaryOperator {

	public static void main(String[] args) {
		int a=90; int b=20;
		int c=30;
		int temp= a>b ? a:b;
		
		int big=c>temp ? c:temp;
		if(temp>big) {
			System.out.println("Greater number is= "+temp);
		}else {
			System.out.println("Greater number is= "+big);
		}
	}

}
