import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = 0;
        try {
            Scanner scan = new Scanner(System.in);

            System.out.println("Put the first number:");
            numberOne = scan.nextInt();
            System.out.println("Put the second number");
            numberTwo = scan.nextInt();

        } catch (Exception e) {
            System.out.println("Data type mismatch");
        }

        try{
            contar(numberOne, numberTwo);
        } catch(ParametrosInvalidosException e) {
            e.printStackTrace();
        }

    }

    static void contar(int numberOne, int numberTwo) throws ParametrosInvalidosException{
        if(numberOne > numberTwo){
            throw new ParametrosInvalidosException("The first parameter is bigger than the second one");
        }

        int contagem = numberTwo - numberOne;
        for(int count = 0; count <= contagem; count++){
            System.out.println(count);
        }
    }
}