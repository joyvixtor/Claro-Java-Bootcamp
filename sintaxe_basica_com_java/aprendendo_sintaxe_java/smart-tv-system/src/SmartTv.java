public class SmartTv {
    boolean turnedOn = true;
    int channel = 1;
    int volume = 25;

    public void turnOnTurnOff(){
        turnedOn = !turnedOn;
        System.out.println((turnedOn == true ? "TV ligada!" : "TV desligada!"));
    }

    public void increaseVolume(){
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }
    public void decreaseVolume(){
        volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void increaseChannel(){
        channel++;
        System.out.println("Canal mudado para: " + channel);
    }
    public void decreaseChannel(){
        channel--;
        System.out.println("Canal mudado para: " + channel);
    }
    public void changeChannel(int novoCanal){
        channel = novoCanal;
        System.out.println("Canal mudado para: " + channel);
    }
}

/**
 * EXPLICANDO UMA DETERMINADA FEATURE
 * BLABLABLA
 * FACA ISSO
 */