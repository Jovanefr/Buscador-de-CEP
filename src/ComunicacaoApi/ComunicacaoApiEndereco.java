package ComunicacaoApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class ComunicacaoApiEndereco implements ComunicacaoApi{
    private String endereco;

    public ComunicacaoApiEndereco(String endereco){
        
        this.endereco = "https://viacep.com.br/ws/" + endereco + "/json/";
    }

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
