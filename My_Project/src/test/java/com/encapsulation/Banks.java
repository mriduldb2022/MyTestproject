package com.encapsulation;

final class Banks {
	//Access modifier  //data type     	// variable        //value
									   // declaration
	  private               int           	balance         = 10000; 
	// Instance variable (inside class but outside method)
	
	  
	  private 			   	String       	accountNumber;
	  
	  private 				String 			Name; 
	  
	  private				String 			Address;
	 						


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	  
	  
	  
	  
	  
	  
}
