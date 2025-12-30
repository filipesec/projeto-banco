package Person;

public class Cliente {
    //dados do cliente
    String name;
    public int cpf;
    //dados da conta
    String password;

    //construtor

    public Cliente(String name, int cpf, String password){
        this.name = name;
        this.cpf = cpf;
        this.password = password;
    }
}
