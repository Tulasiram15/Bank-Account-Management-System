import java.util.Scanner;
public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nBank Account Management System");
            System.out.println("1.Open Account");
            System.out.println("2.Close Account");
            System.out.println("3.Deposit");
            System.out.println("4.Withdraw");
            System.out.println("Display Accounts");
            System.out.println("Exit");
            System.out.print("Enter your choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter account number:");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter account holder name:");
                    String accountHolderName = scanner.nextLine();
                    System.out.println("Enter initial deposit:");
                    double initialDeposit = scanner.nextDouble();
                    bank.OpenAccount(accountNumber, accountHolderName, initialDeposit);
                    break;
                case 2:
                    System.out.println("Enter account number:");
                    accountNumber = (scanner.nextInt());
                    bank.CloseAccount(accountNumber);
                    break;
                case 3:
                    System.out.println("Enter account number:");
                    accountNumber=(scanner.nextInt());
                    System.out.print("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(accountNumber, depositAmount);
                    break;
                case 4:
                    System.out.print("Enter account number:");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount:");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(accountNumber, withdrawalAmount);
                    break;
                case 5:
                    bank.displayAccount();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. please try again.");
            }
        }
        scanner.close();
        System.out.println("Thank you for using bank account management system.");
    }
}



