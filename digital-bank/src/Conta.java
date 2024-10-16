public abstract class Conta {
    protected String numeroDaAgencia;
    protected String numeroDaConta;
    protected double saldo;
    protected Cliente cliente;

    public String getNumeroDaAgencia(){
        return numeroDaAgencia;
    }

    public String getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void sacar(int dinheiroParaSaque){
        if(!(this.saldo - dinheiroParaSaque < 0)){
            System.out.println("Saldo insuficiente para completar o saque");
        } else{
            this.saldo = this.saldo - dinheiroParaSaque;
            System.out.println("Seu saque d " + dinheiroParaSaque + " foi realizado com sucesso!");
        }
    }


}
