package CapgeminiJavaAssignment2;
abstract class Bank {
    abstract void addBalance(int balance);
    static int amount;
    public static void TotalCash(){
        System.out.println("Total cash in the Bank : "+ amount);
    }
}
class SavingsAccount extends Bank{
    int minBalance;
    int balance;
    SavingsAccount(){
        minBalance=5000;
        amount+=minBalance;
    }

    public void addBalance(int fixedDeposit){
        balance+=fixedDeposit;
        amount+=fixedDeposit;
        System.out.println("Fixed Deposit of : "+fixedDeposit);
    }
}
class CurrentAccount extends Bank{
    int minBalance;
    int balance;
    CurrentAccount(){
        minBalance=10000;
        amount+=minBalance;
    }

    public void addBalance(int cashCredit){
        balance+=cashCredit;
        amount+=cashCredit;
        System.out.println("Cash credit of : "+cashCredit);
    }
}


class Main2{
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        CurrentAccount c1=new CurrentAccount();

       makeDeposists(s1,10000);
       makeDeposists(c1,10000);

        Bank.TotalCash();
    }
    private static void makeDeposists(Bank ref, int amount) {
        ref.addBalance(amount);
    }
}