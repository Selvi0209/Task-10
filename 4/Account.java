public class Account {
    private double balance;
 
    public Account() {
        balance = 0.0;  
    }
 
    public Account(double initialBalance) {
        balance = initialBalance;
    } 
	
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
 
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

    public double getBalance() {
        return balance;
    }
 
}
