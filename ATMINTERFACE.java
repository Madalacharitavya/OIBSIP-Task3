import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Bank {
    private String type;
    private double quantum;
    private Date date;

    public Bank(String type, double amount) {
        this.type = type;
        this.quantum = quantum;
        this.date = new Date();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return quantum;
    }

    public Date getDate() {
        return date;
    }

  
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd Hours:mm=inutes:seconds");
        return sdf.format(date) + ": " + type + " of $" + quantum;
    }
}


class BankAccount {
    private String userId;
    private double balance;
    private List<Transaction>  transactionHistory;

    public BankAccount(String userId, double initialBalance) {
        this.userId = userId;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double quantum) {
        balance += quantum;
        transactionHistory.add(new Transaction("Deposit", quantum));
    }

    public boolean withdraw(double quantum) {
        if (quantum <= balance) {
            balance -= quantum;
            transactionHistory.add(new Transaction("Withdrawal", quantum));
            return true;
        }
        return false;
    }

    public boolean transfer(double quantum, BankAccount client) {
        if (quantum <= balance) {
            balance -= quantum;
            transactionHistory.add(new Transaction("Transfer to " + client.getUserId(), quantum));
            client.deposit(quantum);
            client.transactionHistory.add(new Transaction("Transfer from " + userId, quantum));
            return true;
        }
        return false;
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History for client User ID: " + userId);
        for (Transaction transaction : transactionHistory){
            System.out.println(transaction);
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(String userId, double initialBalance) {
        account = new BankAccount(userId, initialBalance);
    }

    public void displayOptions() {
        System.out.println("\nCHERRY-ATM Menu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Transfer");
        System.out.println("5. Transaction History");
        System.out.println("6. Exit");
    }

    public void deposit(double quantum) {
        account.deposit(quantum);
        System.out.println("Deposit successful. New balance: $" + account.getBalance());
    }

    public void withdraw(double quantum) {
        if (account.withdraw(quantum)) {
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Inadequate balance. Withdrawal failed.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + account.getBalance());
    }

    public void transfer(double quantum, ATM client) {
        if (account.transfer(quantum, client.account)) {
            System.out.println("Transfer successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Inadequate balance. Transfer failed.");
        }
    }

    public void displayTransactionHistory() {
        account.displayTransactionHistory();
    }
}

public class ATMINTERFACE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter client User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();

        ATM atm = new ATM(userId, initialBalance);

        int choice;
        do {
            atm.displayOptions();
            System.out.print("Enter your choice from (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit quantum: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.print("Enter transfer quantum: $");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter client's User ID: ");
                    String recipientUserId = scanner.nextLine();
                    ATM clientATM = new ATM(userId, 0);
                    atm.transfer(transferAmount, clientATM);
                    break;

                case 5:
                    atm.displayTransactionHistory();
                    break;

                case 6:
                    System.out.println("Exiting the CHERRY-ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}
