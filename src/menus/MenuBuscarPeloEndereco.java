package menus;

import java.io.IOException;
import java.util.Scanner;

import ComunicacaoApi.ComunicacaoApiEndereco;
import arquivos.LeituraArquivos;

public class MenuBuscarPeloEndereco{
    private Scanner leitura;
    

    public MenuBuscarPeloEndereco(Scanner leitura){
        this.leitura = leitura;
        
    }


    public void iniciar() throws IOException, InterruptedException{
        try {
            System.out.println("Digite a sigla do seu Estado: ");
            String estado = leitura.nextLine();
            System.out.println("Digite o nome da sua cidade: ");
            String cidade = leitura.nextLine();
            System.out.println("Digite o nome do seu bairro: ");
            String bairro = leitura.nextLine();
            String endereco = estado + '/' + cidade + '/' + bairro;

            ComunicacaoApiEndereco novaComunicacao = new ComunicacaoApiEndereco(endereco);

            LeituraArquivos novaLeitura = new LeituraArquivos(novaComunicacao);
            //new EscritaArquivos(novaLeitura.getArquivoEscrita());

            System.out.println(novaLeitura.getArquivoEscrita());
        } catch (NullPointerException e) {
            System.out.println("Endereço não existe");
        }
        
    }
}
