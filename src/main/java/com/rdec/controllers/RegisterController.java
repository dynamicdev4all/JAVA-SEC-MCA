package com.rdec.controllers;

public class RegisterController {
	public static boolean validatePassword(String p1, String p2){
		return !(!(p1.equals(p2)) && p1.length() < 8);
	}
}
