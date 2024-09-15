public class CondicionalTernaria {
    public static void main(String[] args){
        int a = 6;
        int b = 6;

        String resultado = "será bb?";

        // condicional usando if e else
        if (a==b){
            resultado = "Verdadeiro!";
        }
        else{
            resultado = "Falso!";
        }
        System.out.println(resultado);

        // mesma condicional usando ternario
        String resultadoTernario = a == b ? "Verdadeiro!" : "Falso!";
        System.out.println(resultadoTernario);
    }
}
