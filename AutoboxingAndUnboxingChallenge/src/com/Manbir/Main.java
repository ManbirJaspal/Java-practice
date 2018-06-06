package com.Manbir;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("Bank of Atlanta");
	bank.addBranch("Lindbergh");
	bank.addCustomer("Lindbergh", "Manbir", 1000000.00);
	bank.addCustomer("Lindbergh", "Sahib", 200000.50);
	bank.addCustomer("Lindbergh", "Neha", 30000.50);

	bank.addBranch("Downtown");
	bank.addCustomer("Downtown", "Jaspal", 500000.987);

	bank.addCustomerTransaction("Lindbergh", "Manbir", 3456.45);
	bank.addCustomerTransaction("Lindbergh", "Manbir", 23.45);
	bank.addCustomerTransaction("Lindbergh", "Manbir", 5678.45);

	bank.listCustomers("Lindbergh", false);
	bank.listCustomers("Lindbergh", true);
	bank.listCustomers("Downtown", true);

	if(!bank.addCustomer("Melbourne", "Gurdeep", 56.78)) {
		System.out.println("Branch doesnt exist");
	}

    }
}
