public class BasicAccount extends Bank{
    private double overdraft;
    @Override
    public double withdraw(double balance) {
        if (this.balance>=balance){
            overdraft+=30;
            this.balance-=balance;
        }
        else System.out.println("Cannot withdraw");
        return this.balance;
    }
    public double getOverdraft(){
        return overdraft;
    }
    public double payOverdraft(double money){
        overdraft-=money;
        return overdraft;
    }

    public static void main(String[] args) {
        BasicAccount account=new BasicAccount();
        account.setBalance(500);
        System.out.println("BALANCE: "+account.withdraw(200));
        System.out.println("BALANCE: "+account.withdraw(200));
        System.out.println("OVERDRAFT:"+account.getOverdraft());

    }
}
