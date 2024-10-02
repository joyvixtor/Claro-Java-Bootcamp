public class ServicoMensagemInstantanea {
    private void validarConectadoInternet(){
        System.out.println("Validando conexao com a internet");
    }

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Salvando historico");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }
}
