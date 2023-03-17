package Abstraction.practice;

public class Main {
    public static void main(String[] args) {
        // Banking service 1
        BankingService obj = new BankingService();
        obj.addMoney(900);
        System.out.println("Balance is : "+obj.showBalance());
        System.out.println();

        // polymorphism (process behind banking service 2)
        Account obj2 = new CreditCardAccount();
        Account obj3 = new SavingAccount();
        // upcasting or down-casting

        //Banking service 2
        BankingServiceII savingAccount = new BankingServiceII(new SavingAccount());
        savingAccount.deposit(200);
        System.out.println("Saving Balance : "+savingAccount.showBalance()+"$");

        BankingServiceII creditCard = new BankingServiceII(new CreditCardAccount());
        creditCard.deposit(500);
        System.out.println("Credit card balance : "+creditCard.showBalance()+"$");

    }
}
