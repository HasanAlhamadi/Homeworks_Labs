public class Acoount extends Bank {
    @Override
    public double withdraw(double balance) {
        if (this.balance>=balance)
            this.balance-=balance;
        else System.out.println("Cannot withdraw");
        return this.balance;
    }

    public static void main(String[] args) {
        Acoount acoount=new Acoount();
        acoount.setBalance(500);
        System.out.println("YOUR BALANCE: "+acoount.withdraw(300));
    }
}
