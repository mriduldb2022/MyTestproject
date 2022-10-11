package com.conditions;

public class BankRequirements {

	public void fees() {
		int balance = 50;

		if (balance >= 100) {
			System.out.println("The customers do not need to pay any maintenanse fee");
		} else {
			System.out.println("The customer is low on balance.Send a bill");
		}
	}

	public void createAccount() {

		int age = 17;

		if (age >= 18) {
			System.out.println("Customer is allowed to create bank account");

		} else if (age > 15) {
			System.out.println("Need to have parent's consent to create bank account");

		} else if (age < 15) {
			System.out.println("cannot create bank account");
		}
	}

	public void bonus() {
		int amount = 8000;
		if (amount > 5000) {
			System.out.println("Give customer interest of 2 percent ");
		} else {
			System.out.println("Customer will not get any bonus");
		}
	}

	public static void main(String[] args) {

		BankRequirements obj = new BankRequirements();
//		obj.fees();
//		obj.createAccount();
		obj.bonus();
	}

}
