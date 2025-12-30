package Account;

public class BankAccount {
    //dados do cliente
    String name;
    int cpf;
    //dados da conta
    int num;
    String password;
    //valores da conta
    double value;

    //construtor

    public BankAccount(String nome, int cpf, int numero, String senha, double valor){
        this.name = name;
        this.cpf = cpf;
        this.num = num;
        this.password = password;
        this.value  = value;

    }
}
