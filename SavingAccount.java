package Abstraction.practice;

public class SavingAccount implements Account {
    private float balance;
    private float interestRate;

    SavingAccount(){
        balance = 5;
        interestRate = 50;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance -= amount;
        } else {
            System.out.println("Insufficient amount");
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

