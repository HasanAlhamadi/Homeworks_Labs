public class E3_tester {
    public static void main(String[] args) {
        E3 account=new E3(1000);
        account.deposit(500);
        account.withdraw(1000);
        account.addintrest(50);
        account.mystery(account,250);
        System.out.println(account.getbalance());
    }
}
