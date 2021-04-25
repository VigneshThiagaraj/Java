package com.classesandobjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Registration:\n");
		System.out.println("Enter the customer details:");
		System.out.println("Enter the first name:");
		String firstname=br.readLine();
		System.out.println("Enter the last name:");
		String Lastname=br.readLine();
		System.out.println("Enter the contact number:");
		String contact=br.readLine();
		System.out.println("Enter the e-mail id:");
		String mail=br.readLine();
		System.out.println("Enter the proof type:");
		String type=br.readLine();
		System.out.println("Enter the proof id:");
		String proof=br.readLine();
		
		Customer c = new Customer();
		c.registerCustomer(firstname,Lastname,contact,mail,type,proof);
		c.display();
		System.out.println("Do you want to update email?(y/n)");
		String status = br.readLine();
		
		if(status.equals("y")){
		
			System.out.println("Enter the new email:");
			String updateEmail = br.readLine();
			c.updateEmail(updateEmail);

		}
		
		System.out.println("Thank You");
		
	}

}
