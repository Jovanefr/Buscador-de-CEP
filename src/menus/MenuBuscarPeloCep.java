package menus;

import java.io.IOException;
import java.util.Scanner;

import ComunicacaoApi.ComunicacaoApiCep;
import arquivos.EscritaArquivos;
import arquivos.LeituraArquivos;
import exceptions.CepInvalidoException;


public class MenuBuscarPeloCep {
    private Scanner leitura;
    

    public MenuBuscarPeloCep(Scanner leitura){
        this.leitura = leitura;
        
    }
    
    public void iniciar() throws IOException{
      
        try {
            System.out.println("Digite um CEP para busca: ");
            
            String cep = leitura.nextLine();
            

            ComunicacaoApiCep novaComunicacao = new ComunicacaoApiCep(cep);
            LeituraArquivos novaLeitura = new LeituraArquivos(novaComunicacao);
            System.out.println(novaLeitura.getArquivoEscrita());
            new EscritaArquivos(novaLeitura.getArquivoEscrita());
            

           } catch (CepInvalidoException e){
            System.out.println(e.getMessage());
        } 
  
    }
}
