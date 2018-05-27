package com.Manbir;

public class Main {

    public static void main(String[] args) {

//        BankAccount bobsAccount = new BankAccount("12435", 0.00, "Bob Brown", "myemail@bob.com",
//                "(087) 123-4556");
//
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Manbir", 30000.00, "Manbir@email.com");
        System.out.println(person3.getName());

    }
    }

