package arquivos;

import java.io.FileWriter;
import java.io.IOException;

public class EscritaArquivos {

    public EscritaArquivos(String dados) throws IOException{
        FileWriter escrita = new FileWriter("CEP.json", true);
        
        escrita.append(dados);
        escrita.close();

    }
}
