public class BankRunner {
    public static void main(String[] args){
        //new bank is formed
        Bank kcu = new Bank();

        //collin, victoria, and jessejames open accounts
        int collin = kcu.openAccount();
        int victoria = kcu.openAccount(750);
        int jesseJames = kcu.openAccount(888);

        //colin works for a month
        kcu.lookupAccount(collin).deposit(0.12);

        //jessejames buys a puppy
        double puppyMoney = kcu.lookupAccount(jesseJames).withdraw(800);

        //victoria has pity on colin and gives him money for ramen
        kcu.lookupAccount(victoria).transfer(50,kcu.lookupAccount(collin));

        //get the total value of bank
        System.out.printf("The bank's current value is $%.2f\n", kcu.getTotalValue());

        System.out.printf("Collin now has $%.2f\n", kcu.lookupAccount(collin).getBalance());

        System.out.printf("Victoria now has $%.2f\n", kcu.lookupAccount(victoria).getBalance());

        System.out.printf("JesseJames now has $%.2f\n", kcu.lookupAccount(jesseJames).getBalance());
    }
}