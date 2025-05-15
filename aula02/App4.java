public class App4 {
    public static void main(String[] args) {
        var a = new EncapsulatedAccount();
        a.deposit(1000);
        
        //a.balance = 2000;//AGORA SE ALTERA O BALANCE FAZENDO SAQUES E DEPÓSITOS


        /*TER ACESSO DIRETO A ATRIBUTOS, PODE CAUSAR INSEGURANÇA NO CÓDIGO, O QUE FERE O PRINCÍPIO DO ENCAPSULAMENTO
        ENCAPSULAMENTO: O OBJETO DEVE ESCONDER DO MUNDO EXTERNO TUDO QUE É SEU COMPORTAMENTO INTERNO USANDO O MODIFICADOR PRIVATE
        */
        a.printBalance();

        System.out.println(a.getAccountNumber());
        
        a.setAccountOwner("Parker");
       
        System.out.println(a.getAccountOwner());
        
    }
}
