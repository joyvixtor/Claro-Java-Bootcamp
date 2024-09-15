public class Metodos {
    // eh um método do tipo public
    public double somar(int num1, int num2){
        // LOGICA - FINALIDADE DO METODO
        int soma = num1 + num2;
        return soma;
    }

    // metodo que nao retorna nenhum valor
    public void imprimit(String texto){
        System.out.println(texto);
    }
    
    // throws Exception: indica que o metodo ao ser utilizado terá uma excecao
    public double dividir(int dividendo, int divisor) throws Exception{

    }

    // metodo que nao pode ser visto por outras classes
    private void metodoPrivado(){

    }
}
