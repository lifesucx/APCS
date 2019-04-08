import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }

    public int openAccount(double startingBalance){
        this.accounts.add(new BankAccount(startingBalance));
        return accounts.size() - 1;
    }

    public int openAccount(){
        return this.openAccount(0);
    }

    public BankAccount closeAccount(int accountNumber){
        return this.accounts.remove(accountNumber);
    }

    public BankAccount lookupAccount(int accountNumber){
        return this.accounts.get(accountNumber);
    }

    public double getTotalValue(){
        double total = 0;
        for(BankAccount account:accounts){
            total += account.getBalance();
        }
        return total;
    }

    public int getNumberOfAccounts(){
        return accounts.size();
    }
}