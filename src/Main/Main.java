package Main;
import Account.BankAccount;
import Person.Cliente;
import Service.ClienteService;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int choice = 10;
        Scanner scan = new Scanner(System.in);
        //instancia para criar cliente
        ClienteService cliente = new ClienteService();
        //laco para a repeticao do menu
        while(choice != 0){
            System.out.println("1 - Criar Cliente");
            System.out.println("2 - Criar Conta");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Transferir");
            System.out.println("6 - Ver Saldo");
            System.out.println("7 - Gerar Comprovante");
            System.out.println("0 - Sair\n");

            System.out.print("O que deseja realizar -> ");
            choice = scan.nextInt();
            scan.nextLine();

            switch(choice){
                case 1:
                    String name;
                    int cpf;
                    String password;
                    System.out.println("Criação de usuario\n" +
                            "-----------------------");
                    System.out.print("Digite o seu nome: ");
                    name = scan.nextLine();
                    System.out.print("Digite o seu CPF: ");
                    cpf = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Crie uma senha de login: ");
                    password = scan.nextLine();
                    boolean create = cliente.CriarCliente(name, cpf, password);
                    if(create){
                        System.out.println("Cliente cadastrado com sucesso!");
                        System.out.println("-----------------------");
                    }
                    else{
                        System.out.println("Já existe uma conta cadastrada com esse CPF...");
                        System.out.println("-----------------------");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida...");
            }
        }
        scan.close();
    }
}