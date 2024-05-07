public class BankAccount {
    // attributes
    private int accNumber;
    private double balance;
    private String holder;

    // constructor
    public BankAccount(int number, double balance, String holder) {
        this.accNumber = number;
        this.balance = balance;
        this.holder = holder;
    }

    // getters and setters
    public int getNumber() {return this.accNumber;}
    public double getBalance() {return this.balance;}
    public String getHolder() {return this.holder;}

    // methods
    public boolean deposit(double value) {
        if(value<=0)
            return false;
        this.balance+=value;
        return true;
    }

    public boolean withdraw(double value) {
        if(value<=0 || value>=this.balance)
            return false;
        this.balance-=value;
        return true;
    }

    // toString
    @Override
    public String toString() {
        return "\nBankAccount:" +
                "\n number = " + accNumber +
                "\n balance = " + balance +
                "\n holder = '" + holder + "'";
    }
}