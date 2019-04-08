public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public BankAccount(){
        this(0);
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount >= 0) {
            this.balance += amount;
        }
    }

    public double withdraw(double amount){
        if(amount >= 0 && amount <= balance) {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

//    public String getPaymentHistory(){
//        return "";
//    }

    public boolean transfer(double amount, BankAccount destination){
        if(balance >= amount){
            destination.deposit(this.withdraw(amount));
            return true;
        }
        return false;
    }


}
