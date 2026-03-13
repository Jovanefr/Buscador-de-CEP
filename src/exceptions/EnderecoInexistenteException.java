package exceptions;

public class EnderecoInexistenteException extends RuntimeException{
    private String mensagem;

    public EnderecoInexistenteException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return mensagem;
    }
    
}
