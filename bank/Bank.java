
package bank;

import bank.Account;

// access modifiers
// default modifier already defined and accessed inside the pakage(bank) except the other package
// protected modifier itself package(bank) can access it but in other package only sub classes can access
// private modifier only the class can access it not any pakage(bank) or any other package here the Bank class can not access the Account class
public class Bank {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name = "jugno";
        ac1.email = "jugno@gmail.com";
        ac1.password ="abc";
    }
}
