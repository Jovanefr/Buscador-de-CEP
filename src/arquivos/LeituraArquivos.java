package arquivos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import ComunicacaoApi.ComunicacaoApi;
import exceptions.CepInvalidoException;
import models.Endereco;
import models.EnderecoViaCep;

public class LeituraArquivos {

    private String arquivoEscrita;

    public LeituraArquivos(ComunicacaoApi novaComunicacao) {
        try {
            Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
            
            String retornoFormatado = novaComunicacao.respostaApi()
                            .replace("},", "};")
                            .replace("[", "")
                            .replace("]", "");
            
            EnderecoViaCep novoEnderecoViaCep;
            List<Endereco> novoEndereco = new ArrayList<>();
        
        
            for (String endereco : retornoFormatado.split(";")) {
                novoEnderecoViaCep = gson.fromJson(endereco, EnderecoViaCep.class);
                novoEndereco.add(new Endereco(novoEnderecoViaCep)) ;
            }
            
            arquivoEscrita = gson.toJson(novoEndereco);
            
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        } catch(JsonSyntaxException | IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public String getArquivoEscrita() {
        return arquivoEscrita;
    }
}
