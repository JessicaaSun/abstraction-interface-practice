package Abstraction.practice;

public class CreditCardAccount implements Account {
    private float balance;
    private float interestRate;
    private float limitSpending;

    CreditCardAccount(){
        balance = 10;
        limitSpending = 100;
        interestRate = 30;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=limitSpending){
            if(amount<=balance){
                balance -= amount;
            } else {
                System.out.println("Insufficient amount");
            }
        } else {
            System.out.println("Exceed limitation");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public float showBalance() {
        return balance;
    }

    @Override
    public float interest() {
        return (balance * interestRate/100);
    }


}


