package ComunicacaoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import exceptions.CepInvalidoException;

public class ComunicacaoApiCep implements ComunicacaoApi {
    private String endereco;

    public ComunicacaoApiCep(String endereco){
        if(endereco.length() != 8){
            throw new CepInvalidoException("O CEP precisa ter exatamente 8 digitos");
        }
        this.endereco = "https://viacep.com.br/ws/" + endereco + "/json/";
    }
    @Override
    public String respostaApi() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                        .uri(URI.create(endereco))
                                        .build();
        HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString()); 
        
        


        return response.body();
    }

}
