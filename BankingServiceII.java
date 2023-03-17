package Abstraction.practice;

public class BankingServiceII {

    private Account account;

    public BankingServiceII(Account account){
        this.account = account;
    }
    public float showBalance(){
        return this.account.showBalance();
    }
    public void withdrawMoney(float amount) {
        account.withdraw(amount);
    }
    public void deposit(float amount){
        account.deposit(amount);
    }

}
