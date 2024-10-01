public abstract class Vehicle {
    private String chassi;
    
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public abstract void ligar();
}
