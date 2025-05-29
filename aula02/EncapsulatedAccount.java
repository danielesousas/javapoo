public class EncapsulatedAccount {
    private String accountNumber;
    private String accountOwner;
    private double balance;

    public EncapsulatedAccount(String accountNumber, String accountOwner, double balance) {
        //CONTRUTOR QUE CHAMA CONSTRUTOR, MAIS GENÉRICO
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public EncapsulatedAccount(String accountNumber) {//DEVE TER O MESMO NOME DA CLASSE
        //AGORA O JAVA NÃO TEM MAIS O CONSTRUTOR PADRÃO (VAZIO), ENTÃO NA CRIAÇÃO DO OBJETO, O ACCOUNTNUMBER DEVERÁ SER PASSADO
        //this.accountNumber = accountNumber; -> ANTES DO CONSTRUTOR CHAMAR OUTRO CONSTRUTOR
        this(accountNumber, null, 0);
    }

    public EncapsulatedAccount(String accountNumber, String accountOwner) {
        //this.accountNumber = accountNumber;
        //this.accountOwner = accountOwner; -> ANTES DO CONSTRUTOR CHAMAR OUTRO CONSTRUTOR
        this(accountNumber, accountOwner, 0);
    }

    public EncapsulatedAccount(String accountNumber, double balance) {
        //this.accountNumber = accountNumber;
        //this.balance = balance;
        this(accountNumber, null, balance);
    }

    boolean deposit(double amount) { //AQUI VAI RETORNAR UM BOLEANO AO TERMINAR A FUNÇÃO
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;

    }

    //SOBRECARGA DE MÉTODO É QUNADO HÁ 2 MÉTODOS COM O MESMO NOME, MAS HÁ REGRAS
    boolean deposit(String amount) {
        return deposit(Double.parseDouble(amount));
    }


    boolean withdraw(double amount) {
        if (amount > 0){
            balance -= amount;
            return true;
        }
        return false;
        
    }

    void transfer(double amount, Account targetAccount) {//PASSANDO DOIS PARÂMETROS
        withdraw(amount);
        targetAccount.deposit(amount);
    }


    void printBalance() { //MÉTODO VOID NÃO RETORNA NADA AO TERMINAR A FUNÇÃO
        System.out.println("Balance: R$ " + balance);
    }

    public String getAccountNumber() {
        //O GET CRIA UM MÉTODO P/ ACESSAR O VALOR DE UM ATRIBUTO, SEM PODER MODIFICÁ-LO
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
    //O SET RECEBE O ATRIBUTO COMO PARÂMETRO E NÃO RETORNA NADA, SERVE PARA MODIFICAR O VALOR DO ATRIBUTO
        this.accountOwner = accountOwner;
    }
}
