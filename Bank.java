import java.util.Scanner;

public class Bank {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        double balance = 0.0;
        int choice;

        while(running) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance); // Changed this line
                case 4 -> running = false;
                default -> System.out.println("You have entered wrong input");
            }
        }
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("Current balance: $" + balance);
    }

    static double deposit() {
        double amount;
        System.out.println("Enter the amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            System.out.println("Successfully deposited: $" + amount);
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else if(amount > balance) {
            System.out.println("Insufficient funds. Available balance: $" + balance);
            return 0;
        } else {
            System.out.println("Successfully withdraw: $" + amount);
            return amount;
        }
    }
}