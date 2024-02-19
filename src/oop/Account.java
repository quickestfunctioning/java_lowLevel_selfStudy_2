package oop;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(balance<amount){
            System.out.println("잔액 부족");
            System.out.println(balance);
        } else{
            balance -= amount;
        }
    }
    void show(){
        System.out.println(balance);
    }
}
