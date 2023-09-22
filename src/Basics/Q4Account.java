package Basics;

public class Q4Account {
	private double balance;

    // Constructor with one argument
    public Q4Account(double initialBalance) {
        balance = initialBalance;
    }

    // Constructor with two arguments
    public Q4Account(double initialBalance, double overdraftLimit) {
        if (initialBalance >= overdraftLimit) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be less than the overdraft limit.");
            balance = 0.0;
        }
    }

    // Method to withdraw funds
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    // Method to deposit funds
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Example usage of the Account class
        Q4Account account1 = new Q4Account(1000.0); // Using the constructor with one argument
        Q4Account account2 = new Q4Account(500.0, 2000.0); // Using the constructor with two arguments

        account1.deposit(200.0);
        account1.withdraw(50.0);

        account2.deposit(300.0);
        account2.withdraw(1000.0);
    }
}
