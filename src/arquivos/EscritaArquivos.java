package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class EscritaArquivos {

    public EscritaArquivos(String dados) throws IOException{
        String historico = Files.readString(Paths.get("CEP.json"), StandardCharsets.ISO_8859_1);
        FileWriter escrita = new FileWriter("CEP.json");
        historico = historico + dados;

        escrita.write(historico.replace("][",","));
        escrita.close();
        
    }
}
