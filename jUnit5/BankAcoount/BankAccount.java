public class BankAccount {
    int balance=21000;
    void withdraw(int m) throws InsufficientFundsException{
        if(m>balance)
            throw new InsufficientFundsException("Insufficient Balance");
    }

}
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String str){
        super(str);
    }
}