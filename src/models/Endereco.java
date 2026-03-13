package models;


public class Endereco {
    
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public Endereco(EnderecoViaCep novoEnderecoViaCep){
        this.cep = novoEnderecoViaCep.cep();
        this.localidade = novoEnderecoViaCep.localidade();
        this.bairro = novoEnderecoViaCep.bairro();
        this.estado = novoEnderecoViaCep.estado();
    }
    
    public Endereco(){
        
    }
    

    public String getCep() {
        return cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getUnidade() {
        return unidade;
    }
    public String getBairro() {
        return bairro;
    }
    public String getLocalidade() {
        return localidade;
    }
    public String getUf() {
        return uf;
    }
    public String getEstado() {
        return estado;
    }
    public String getRegiao() {
        return regiao;
    }
    public String getIbge() {
        return ibge;
    }
    public String getGia() {
        return gia;
    }
    public String getDdd() {
        return ddd;
    }
    public String getSiafi() {
        return siafi;
    }

    @Override
    public String toString() {
        return "CEP: " + getCep() +
                "\nEstado: " + getEstado() + 
                "\nCidade: " + getLocalidade() + 
                "\nBairro: " + getBairro();
    }

}
