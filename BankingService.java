package Abstraction.practice;

public class BankingService {
    SavingAccount savingAccount;
    CreditCardAccount creditCardAccount;

    // fix null pointer in main error
    //1st option
    BankingService() {
        savingAccount = new SavingAccount();
        creditCardAccount = new CreditCardAccount();
    }

    //2nd option
    BankingService(SavingAccount savingAccount, CreditCardAccount creditCardAccount) {
        this.savingAccount = savingAccount;
        this.creditCardAccount = creditCardAccount;
    }

    float showBalance() {
        return savingAccount.showBalance();
    }

    void addMoney(float amount) {
        savingAccount.deposit(amount);
    }

    void withdrawMoney(float amount) {
        savingAccount.withdraw(amount);
    }
}