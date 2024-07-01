public interface BankOperations {
    void OpenAccount(int accountNumber, String accountHolderName, double initialDeposit);
    void CloseAccount(int accountNumber);
    void deposit(int accountNumber, double amount);
    void withdraw(int accountNumber, double amount);
    void displayAccount();

}
