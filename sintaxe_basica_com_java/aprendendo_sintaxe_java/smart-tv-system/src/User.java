public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();

        System.out.println("TV Ligada? " + smarTv.turnedOn);
        System.out.println("Canal Atual?: " + smarTv.channel);
        System.out.println("Volume?: " + smarTv.volume);




        smarTv.turnOnTurnOff();
    }
}
