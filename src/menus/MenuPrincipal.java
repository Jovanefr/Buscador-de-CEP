package menus;


import java.io.IOException;
import java.util.Scanner;


public class MenuPrincipal {

    public void iniciar() throws IOException, InterruptedException{
        System.out.println("-----------Bem Vindo-----------");
        
        Scanner leitura = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Selecione uma das opcoes abaixo");
            System.out.println("""
                1- Buscar pelo CEP
                2- Buscar pelo endereço
                0- Para sair
                """);
            opcao = leitura.nextInt();
            leitura.nextLine();
            if(opcao > 2 || opcao < 0){
                System.out.println("Essa opcao nao existe. Tente novamente");
                System.out.println("""
                1- Buscar pelo CEP
                2- Buscar pelo endereço
                0- Para sair
                """);
            }

            switch (opcao) {
            case 1:
                MenuBuscarPeloCep novaBusca = new MenuBuscarPeloCep(leitura);
                novaBusca.iniciar();
                break;
            case 2:
                MenuBuscarPeloEndereco novaBusca_ = new MenuBuscarPeloEndereco(leitura);
                novaBusca_.iniciar();
                break;
            case 0:
                System.out.println("Encerrando...");
                break;
            default:
                break;
        }
        } while(opcao != 0);
        
        leitura.close();
    }
    
}
