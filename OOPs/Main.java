package OOPs;

class BankAccountSystem {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;

    public BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;  
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccountSystem) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Bank: " + bankName);
        } else {
            System.out.println("Not a valid BankAccount object.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccountSystem acc1 = new BankAccountSystem("Kunal Singhal", 1001);
        BankAccountSystem acc2 = new BankAccountSystem("Diya Sharma", 1002);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println();
        BankAccountSystem.getTotalAccounts();
    }
}
