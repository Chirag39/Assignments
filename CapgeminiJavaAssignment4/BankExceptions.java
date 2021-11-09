package CapgeminiJavaAssignment4;

import java.util.Scanner;

public class BankExceptions {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        SavingsAccount s1= new SavingsAccount();

        System.out.print("Balance : ");
        double balanceAmount= ip.nextDouble();
        s1.setBalance(balanceAmount);

        System.out.print("Amount to be deposited : ");
        double depositAmount=ip.nextDouble();
        s1.Deposit(depositAmount);

        System.out.print("Amount to be withdrawn : ");
        double withdrawAmount=ip.nextDouble();
        s1.Withdraw(withdrawAmount);

    }
}

class SavingsAccount{
    long id;
    static double balance;
    double withdraw;
    double deposit;

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public void Deposit(double deposit){
        try{
            if(deposit<0)
                throw new IllegalBankTransactionException("Invalid Amount");
            else{
//                this.deposit=deposit;
                balance+=deposit;
                System.out.println("Deposit of rs "+deposit+" succesful \nAvailable balance is : rs "+balance);
            }
        } catch (IllegalBankTransactionException e) {
            System.out.println(e);
        }
    }

    public void Withdraw(double withdraw){
        try{
            if(withdraw>balance)
                throw new InsufficientBalanceException("Insufficient Balance...");
            else{
//                this.withdraw=withdraw;
                balance-=withdraw;
                System.out.println("Withdraw of amount rs "+withdraw+" succesful \nAvailable balance is : rs "+balance);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }
    }

}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String str)
    {super(str);}
}

class IllegalBankTransactionException extends Exception {
    public IllegalBankTransactionException(String str)
    {super(str);}
}
