public class Car extends Vehicle{
    @Override
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    // ENCAPSULAMENTO
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo câmbio");
    }
}