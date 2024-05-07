public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1234, 0, "tonas");

        System.out.println(tryDeposit(100, acc1));
        System.out.println(acc1.getBalance());
        System.out.println(tryDraw(13.4, acc1));
        System.out.println(acc1.getBalance());

        System.out.println(acc1);
    }

    public static String tryDeposit(double value, BankAccount BankAccount) {
    if(BankAccount.deposit(value))
        return "Sucesfully deposited";
    else
         return "Failed to deposit";
    }

    public static String tryDraw(double value, BankAccount BankAccount) {
    if(BankAccount.withdraw(value))
        return "Sucesfully drawed";
    else
        return "Failed to draw";
    }
}