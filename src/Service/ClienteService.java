package Service;
import Person.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public boolean CriarCliente(String name, int cpf, String password) {
        for (Cliente c : clientes) {
            if(c.cpf == cpf){
                return false;
            }
        }

        Cliente novo = new Cliente(name, cpf, password);
        clientes.add(novo);
        return true;
    }

}