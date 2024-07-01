import java.util.ArrayList;
import java.util.List;
public class Bank implements BankOperations{
    private final List<BankAccount> accounts;
    public Bank() {
        accounts = new ArrayList<>();
    }

    @Override
    public void OpenAccount(int accountNumber, String accountHolderName, double initialDeposit) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account opened successfully.");
    }

    @Override
    public void CloseAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accounts.remove(account);
                System.out.println("Account closed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    @Override
    public void deposit(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    @Override
    public void withdraw(int accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    @Override
    public void displayAccount() {

    }

}


