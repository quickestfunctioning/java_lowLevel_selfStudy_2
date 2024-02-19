package oop;

public class AccountMain {
    public static void main(String[] args) {
        Account good = new Account();
        good.deposit(10000);
        good.withdraw(9000);
        good.withdraw(2000);
        good.show();
    }
}
