abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    public abstract void calculateInterest();
    
    public abstract void withdraw(double amount);
    
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("New Balance: $" + this.balance);
    }
    
    public void displayDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.accountHolder);
        System.out.println("Balance: $" + this.balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    
    public void calculateInterest() {
        double interest = this.balance * this.interestRate / 100;
        this.balance = this.balance + interest;
        System.out.println("Interest added: $" + interest);
        System.out.println("New Balance: $" + this.balance);
    }
    
    public void withdraw(double amount) {
        if (this.balance - amount >= 500) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + this.balance);
        } else {
            System.out.println("Insufficient balance! Minimum balance of $500 required.");
        }
    }
    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + this.interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;
    
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    public void calculateInterest() {
        System.out.println("No interest for current account.");
    }
    
    public void withdraw(double amount) {
        if (this.balance + this.overdraftLimit >= amount) {
            this.balance = this.balance - amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New Balance: $" + this.balance);
        } else {
            System.out.println("Insufficient balance! Overdraft limit exceeded.");
        }
    }
    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account Type: Current Account");
        System.out.println("Overdraft Limit: $" + this.overdraftLimit);
    }
}

public class Lab4 {
    public static void main(String[] args) {
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount("SA001", "John Doe", 5000, 5.5);
        savings.displayDetails();
        System.out.println();
        
        savings.deposit(2000);
        System.out.println();
        
        savings.calculateInterest();
        System.out.println();
        
        savings.withdraw(1000);
        System.out.println();
        
        System.out.println("=== Current Account ===");
        CurrentAccount current = new CurrentAccount("CA001", "Jane Smith", 3000, 2000);
        current.displayDetails();
        System.out.println();
        
        current.deposit(1500);
        System.out.println();
        
        current.calculateInterest();
        System.out.println();
        
        current.withdraw(4000);
        System.out.println();
        
        System.out.println("=== Polymorphism Demo ===");
        Account acc1 = new SavingsAccount("SA002", "Bob Wilson", 10000, 6.0);
        Account acc2 = new CurrentAccount("CA002", "Alice Brown", 8000, 3000);
        
        acc1.displayDetails();
        System.out.println();
        acc1.calculateInterest();
        System.out.println();
        
        acc2.displayDetails();
        System.out.println();
        acc2.calculateInterest();
    }
}
