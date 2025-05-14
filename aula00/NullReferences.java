public class NullReferences {// ou Null Pointer Exception
    public static void main(String[] args) {
       // Account a = null;
       // a.printBalance();
       Account a = null;

       if (a != null) {
           a.printBalance();
       } else {
        System.out.println("Nulo");
       }
    }

}

/*
 * ALGUMAS EXCEÇÕES NÃO DEVEN SER TRATADAS, MAS SIM CORRIGIDAS, POIS SÃO PROBLEMAS DE CÓDIGO, ALGUM COMPORTAMENTO INESPERADO ACONTECEU
 * COMO NESSE EXEMPLO: A VARIÁVEL A É NULL (ELA NÃO APONTA P/ NINGUÉM NO HEAP), LOGO, QUALQUER COISA QUE SE TENTE FAZER COM ELA VAI DAR ERRO, ELA NÃO APONTA PARA NENHUMA REFERÊNCIA
 */
