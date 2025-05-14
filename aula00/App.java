public class App {//stack, heap e garbage colector

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.accountNumber = "1234-5";
        a1.accountOwner = "Jonh";
        a1.balance = 100;

        Account a2 = new Account();
        a2.accountNumber = "5768-4";
        a2.accountOwner = "Mary";
        a2.balance = 15900;

        System.out.println(a1.accountNumber);
        System.out.println(a1.accountOwner);
        System.out.println(a1.balance);
        System.out.println("--------------");
        System.out.println(a2.accountNumber);
        System.out.println(a2.accountOwner);
        System.out.println(a2.balance);
    }
}
