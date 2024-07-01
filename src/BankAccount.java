public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void SetAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit was successful. New balance:" + balance);
        }else {
            System.out.println("Invalid deposit amount.");
        }
        }
        public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal was successful. New balance:" + balance);
        }else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
        }
        @Override
    public String toString(){
        return "BankAccount{" + "accountNumber=" + accountNumber + ", accountHolderName='" + accountHolderName + '\'' + ", balance=" + balance + '}';
        }
}

