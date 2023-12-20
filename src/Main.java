import java.util.Scanner;

public class Main {
    /*

    In this assignment You must have to create method first and then call it in main.

    Program programming must take input from user.

    Make as generic as possible.

    · Create a bank application

    · Where user get deposit their amount.

    · Withdraw their amount.

    · Three type of account they can choose. (Saving, current, demat)

    · Make a separate section for F.D where user can deposit money for fix time period.

    · Use oops concept for creating this application.

    · You must show the current balance for user. When he performed deposit and withdraw.
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingAccount = new SavingAccount(3.5); // 3.5% interest rate
        CurrentAccount currentAccount = new CurrentAccount(1000); // $1000 overdraft limit
        DematAccount dematAccount = new DematAccount("XYZ123"); // Demat account with trading license "XYZ123"

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an account to perform operations:");
            System.out.println("1. Saving Account");
            System.out.println("2. Current Account");
            System.out.println("3. Demat Account");
            System.out.println("4. Exit\n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    operateAccount(savingAccount, scanner);
                    break;
                case 2:
                    operateAccount(currentAccount, scanner);
                    break;
                case 3:
                    operateAccount(dematAccount, scanner);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }

        scanner.close();
    }

    private static void operateAccount(Account account, Scanner scanner) {
        boolean backToMenu = false;

        while (!backToMenu) {
            System.out.println("\nOperations for selected account:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Back to Account Selection");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
