//WAP to Check Whether a Character is an 
//English Alphabet (upper & lower case) or Not
package com.practiceNumberProgram;

public class CheckCharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		char c='M';
		if(c>=65 && c<=90) {
			System.out.println(c+" is an uppercase alphabet");
		}
		else if(c>97 && c<=122 ) {
			System.out.println(c+" character is not an alphabet");
		}else {
			System.out.println(c+" is not an alphabet");
		}
		
	}

}
