package com.rdec.middlewares;

public class DataValidation {
	public static boolean isPasswordValid(String pass1, String pass2) {
		boolean isValid = false;
		if(pass1.equals(pass2) && pass1.length()>=8 ) {
			isValid = true;
		}
		return isValid;
	}
	
	boolean isNameValid(String name) {
		//your code goes here
		return true;
		
	}
}
