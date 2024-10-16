import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        RandomNumber randomNumberAgency = new RandomNumber(7);
        RandomNumber randomNumberAccount = new RandomNumber(5);


        System.out.println("Bem vindo ao sistema de comunicação bancária! Escolha o serviço que deseja realizar:");
        System.out.println("1 - Criação de conta bancária");
        System.err.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.err.println("4 - Verificar extrato");
        System.out.println("Sair - encerrar atendimento");

        Scanner scanner = new Scanner(System.in);
        // TO DO: Make a switch statement
        while(true){
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

                    System.err.println("Conta criada com sucesso! Agência: ");

                    break;
                case "Sair":
                    System.err.println("Saindo do sistema de comunicação bancária");
                    scanner.close();
            }
        }
    }
}
