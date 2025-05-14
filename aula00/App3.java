public class App3 {
    public static void main(String[] args){
        Account a = new Account();
        a.deposit(1000);
        a.deposit("100");

        Account b = new Account();
        b.deposit(10);

        a.transfer(500, b);

        a.printBalance();
        b.printBalance();
    }
}
