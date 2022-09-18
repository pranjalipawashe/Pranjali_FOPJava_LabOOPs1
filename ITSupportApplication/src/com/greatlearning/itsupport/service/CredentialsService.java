package com.greatlearning.itsupport.service;
import java.util.Random;


public class CredentialsService {
	private String emailId;
    private char[] password= new char[8]; 
    
	public String generateEmailId(String firstName, String lastName, String Dept) {
		this.emailId = firstName + lastName + "@" + Dept + ".greatlearning.com";
		//return(firstName + lastName + "@" + Dept + ".greatlearning.com");
		return this.emailId;
	}
	
	public char[] generatePassword() {
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String splChars = "@_#$&*";
		String wholeStr = capLetters.concat(smallLetters).concat(splChars).concat(numbers);
		char[] password = new char[8];
		Random randNum = new Random();
		//we can use character array	    
		
		for(int i =0; i<8; i++) {
		   password[i] =wholeStr.charAt(randNum.nextInt(wholeStr.length()));
		}
		this.password = password;
		return password;
	}
	
	public void showCredentials() {
		   System.out.println("Generated Credentials are : \nEmail : " + this.emailId + "\nPassword : " + new String(this.password));

		
	}
}
