package Abstraction.practice;

public interface Account {
    void withdraw(double amount);
    void deposit(double amount);
    float showBalance();
    float interest();
}