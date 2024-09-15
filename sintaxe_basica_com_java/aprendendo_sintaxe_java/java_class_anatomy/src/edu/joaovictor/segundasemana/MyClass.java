package edu.joaovictor.segundasemana;
public class MyClass {
    //a special method that needs to be called or started
    //main method
    public static void main(String[] args){
        //system method to print someone in terminal
        System.out.println("meia noite horario oficial do oleo de macaco");
        System.out.println("midnight monkey oil official hour");

        //variaveis mutaveis
        String meuNome = "Joao Victor";
        String segundoNome = "Melo Bezerra";
        int anoFabricacao = 2022;
        boolean simNao = true;

        //variaveis imutaveis
        final String SOBRENOME = "Melo Bezerra";
        final int ANO_NASCIMENTO = 2002;



        // calling the nomeCompleto method
        String nomeCompleto = nomeCompleto(meuNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    //creating a method
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        // it returns the full name
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
