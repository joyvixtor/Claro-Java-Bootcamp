import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banco {
    private static final Map<String, Conta> LISTA_CONTAS = new HashMap<>();
    public static void main(String[] args) throws Exception {

        RandomNumber randomNumberAgency = new RandomNumber(1);
        RandomNumber randomNumberAccount = new RandomNumber(7);


        System.out.println("Bem vindo ao sistema de comunicação bancária! Escolha o serviço que deseja realizar:");
        System.out.println("1 - Criação de conta bancária");
        System.err.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.err.println("4 - Verificar extrato");
        System.err.println("5 - Fazer uma transferência");
        System.out.println("Sair - encerrar atendimento");

        Scanner scanner = new Scanner(System.in);
        // TO DO: Make a switch statement
        boolean loopComandos = true;
        while(loopComandos){
            String command = scanner.nextLine();
            switch(command){
                case "1":
                    System.out.println("Insira seu nome");
                    String nome = scanner.nextLine();
                    System.err.println("Insira seu CPF");
                    String cpf = scanner.nextLine();
                    System.err.println("Insira seu Telefone");
                    String telefone = scanner.nextLine();
                    System.err.println("Insira seu E-mail");
                    String email = scanner.nextLine();

                    Cliente novoCliente = new Cliente(nome, cpf, telefone, email);

                    String numberAggency = String.valueOf(randomNumberAgency.generateRandomNumber());
                    String numberAccount = String.valueOf(randomNumberAccount.generateRandomNumber());
                    ContaCorrente novaContaCorrente = new ContaCorrente(numberAggency, numberAccount, novoCliente);
                    LISTA_CONTAS.put((numberAggency + numberAccount), novaContaCorrente);

                    System.err.println("Conta criada com sucesso! Agência: " + novaContaCorrente.numeroDaAgencia + " Conta: " + novaContaCorrente.getNumeroDaConta());
                    System.out.println("Insira um novo comando");
                    break;
                case "2":
                    Conta contaCliente = lookingAccount(LISTA_CONTAS);
                    if(contaCliente != null){
                        System.err.println("Digite o valor que deseja sacar");
                        Double dinheiroSaque = scanner.nextDouble();
                        contaCliente.sacar(dinheiroSaque);
                    } else{
                        System.err.println("Conta bancária não existe");
                    }
                    break;
                case "3":
                    contaCliente = lookingAccount(LISTA_CONTAS);
                    if(contaCliente != null){
                        System.err.println("Digite o valor que deseja depositar");
                        Double dinheiroDeposito = scanner.nextDouble();
                        contaCliente.depositar(dinheiroDeposito);
                    } else{
                        System.err.println("Conta bancária não existe");
                    }
                    break;
                case "4":
                    contaCliente = lookingAccount(LISTA_CONTAS);
                    if(contaCliente != null){
                        contaCliente.verExtrato();
                    }else{
                        System.err.println("Conta bancária não existe");
                    }
                case "5":
                    Conta contaEmissor = lookingAccount(LISTA_CONTAS);
                    Conta contaReceptor = lookingAccount(LISTA_CONTAS);

                    System.err.println("Qual o valor da transferência?");
                    double dinheiroParaTransferencia = scanner.nextDouble();

                    contaEmissor.transferir(contaReceptor, dinheiroParaTransferencia);
                    break;
                case "Sair":
                    System.err.println("Saindo do sistema de comunicação bancária");
                    scanner.close();
                    loopComandos = false;
                    break;
                    
            }
        }
        scanner.close();
    }

    private static Conta lookingAccount(Map<String, Conta> listaContas){
        Scanner scanner = new Scanner(System.in);

        System.err.println("Digite o número da agência: ");
        String numberAggency = scanner.nextLine();
        System.err.println("Digite o número da conta");
        String numberAccount = scanner.nextLine();

        String keyAccount = (numberAggency + numberAccount);
        return listaContas.get(keyAccount);
    }
}
