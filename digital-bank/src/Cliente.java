public class Cliente {
    private String nome;
    private String cpf;
    private String contatoTelefone;
    private String contatoEmail;

    public Cliente(String nome, String cpf, String contatoTelefone, String contatoEmail){
        this.nome = nome;
        this.cpf = cpf;
        this.contatoTelefone = contatoTelefone;
        this.contatoEmail = contatoEmail;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getContatoTelefone(){
        return contatoTelefone;
    }

    public String getContatoEmail(){
        return contatoEmail;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setContatoTelefone(String contatoTelefone){
        this.contatoTelefone = contatoTelefone;
    }

    public void setContatoEmail(String contatoEmail){
        this.contatoEmail = contatoEmail;
    }
}
