package OOPs;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountHolder,String accountNumber, double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    
    public void deposit(double amount){
            if(amount>0){
                balance+=amount;
                System.out.println("Deposited: "+amount);
            }
            else{
                System.out.println("Amount must be Greater than Zero");
            }
    }

    public void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance-=amount;
            System.out.println("Amount withdrawn: "+amount );
        }
        else{
            System.out.println("Not enough balance");
        }
    }

    public void displayDetails(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("Kunal","187599", 9578599);
        c1.deposit(578550);
        c1.withdraw(8000000);
        c1.displayDetails();
    }
}
