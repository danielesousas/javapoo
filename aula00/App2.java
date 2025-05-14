public class App2 {
    public static void main(String[] args) {
        Account a = new Account();
        //a.balance = 200;
        
        if (!a.deposit(-100)) {
            System.out.println("Ops! Depósito inválido!");
        }


        a.deposit(200);
        a.withdraw(250);
        a.printBalance();
    }
}
