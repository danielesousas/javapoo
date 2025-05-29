public class Construtores {
    public static void main(String[] args) {
        //var b = new EncapsulatedAccount();    POR CAUSA DA CRIÇÃO DO CONSTRUTOR, NÃO SE PODE MAIS CRIAR OOBJETOS DESSA FORMA. É PRECISO PASSAR O ATRIBUTO
        var b = new EncapsulatedAccount("1234-5");
        var c = new EncapsulatedAccount("432-1", 2000);
        //OUTRO CONSTRUTOR, COM MESMO NOME, PORÉM DOIS PARÂMETROS 

    }
}


/*SE COMPORTA COMO UM MÉTODO
 *SERVE PARA PASSAR INFORMAÇÕES NO MOMENTO DE CRIAÇÃO DO OBJETO
 */