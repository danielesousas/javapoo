public class Account {
    String accountNumber;
    String accountOwner;
    double balance;

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
}
