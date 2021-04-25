package com.classesandobjects;

public class Customer {
	
	String fName,lName, contactNumber, eMail, proofType, proofId;
	

	public void registerCustomer(String fName, String lName, String contactNumber,
			String eMail, String proofType, String proofId) {
		
		this.fName = fName;
		this.lName = lName;
		this.contactNumber = contactNumber;
		this.eMail = eMail;
		this.proofType = proofType;
		this.proofId = proofId;
	}
	
	public void display(){
		int count=1; 
		
		System.out.println("Thank you for registering. Your id is "+count+"..");
		
		System.out.println("The customer details are as follows");
		System.out.println("The customer details are:");
		
		System.out.println("First Name : "+ fName);
		System.out.println("Last Name : "+ lName);
		System.out.println("COntact Number : "+ contactNumber);
		
		System.out.println("E-Mail : "+ eMail);
		System.out.println("Proof Type : "+ proofType);
		System.out.println("Proof ID : "+ proofId);
		
		count++;
	}
	
	public void updateEmail(String updateEmail){
		System.out.println("Email updated.");
		System.out.println("The customer details are as follows");
		System.out.println("The customer details are:");
		
		System.out.println("First Name : "+ fName);
		System.out.println("Last Name : "+ lName);
		System.out.println("COntact Number : "+ contactNumber);
		
		System.out.println("E-Mail : "+ updateEmail);
		System.out.println("Proof Type : "+ proofType);
		System.out.println("Proof ID : "+ proofId);
	}

}
