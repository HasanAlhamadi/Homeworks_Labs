public class Bank {
    protected double balance;

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public double withdraw(double balance){
        this.balance-=balance;
        return this.balance;
    }
}
