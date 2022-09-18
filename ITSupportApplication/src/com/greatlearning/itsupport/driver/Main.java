package com.greatlearning.itsupport.driver;

import java.util.Scanner;

import com.greatlearning.itsupport.model.Employee;
import com.greatlearning.itsupport.service.CredentialsService;

public class Main {
	public static void main(String[] args ) {
		   
		   String firstName, lastName;
		   String emailId = "";
		   char[] password = new char[8];
		   Scanner scanner = new Scanner(System.in); 
		   System.out.println("Enter FirstName of the employee :");
		   firstName = scanner.next();
		   System.out.println("Enter LastName of the employee :");
		   lastName = scanner.next();
		   
		   Employee Emp = new Employee(firstName, lastName);
		   CredentialsService Service = new CredentialsService();
		   
		   System.out.println("Please enter the dept from the following: ");
		   System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");
		   int option = scanner.nextInt();
		   switch(option) {
		   case 1 :
			   emailId = Service.generateEmailId(Emp.getFirstName(), Emp.getLastName(), "tech");
			   password = Service.generatePassword();
			   break;
		   case 2 :
			   emailId = Service.generateEmailId(Emp.getFirstName(), Emp.getLastName(), "admin");
			   password = Service.generatePassword();
			   break;
		   case 3 :
			   emailId = Service.generateEmailId(Emp.getFirstName(), Emp.getLastName(), "hr");
			   password = Service.generatePassword();
			   break;
		   case 4 :
			   emailId = Service.generateEmailId(Emp.getFirstName(), Emp.getLastName(), "leg");
			   password = Service.generatePassword();
			   break;
		   default :
			   System.out.println("Wrong choice");
			   break;
		   }
		   Service.showCredentials();
	       scanner.close(); 
		   
		}
}
