public class Racetrack{
    public static void main(String[] args){
        Car jeep = new Car();
        jeep.setChassi("8769756");
        jeep.ligar();

        Moto zQuatrocentos = new Moto();
        zQuatrocentos.setChassi("467754");
        zQuatrocentos.ligar();

        Vehicle coringa = zQuatrocentos;
        coringa.ligar();
    }
}