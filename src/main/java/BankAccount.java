package th.ac.kmitl.atm;

public class BankAccount {
    private int id;
    private String name;
    private double balance;


    public BankAccount(int id, String name) {
        this(id, name, 0);
    }


    public BankAccount(int id, String name, double initialBalance) {
        this.id = id;
        this.name = name;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        balance = balance + amount;
    }


    public void withdraw(double amount) {
        balance = balance - amount;
    }


    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

