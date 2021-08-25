
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.ServiceUnavailableException;



public class Aula5Ex3 
{
    public static void carregaClientes(List<Cliente> l)
    {

        
        String linha;
        String nome;
        String tel;
        String serv;
        

        String[] info = new String[3];
        

        try
        {
           
            File f = new File("clientes.txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            
            //Lendo linha por linha

            linha = bf.readLine();
            while (linha != null)
            {
                if(linha.length() > 0)
                {
                    
                    info    = linha.split(";");

                    nome    = info[0];
                    tel     = info[1];
                    serv    = info[2];

                
                //System.out.println(info[0]);
               // System.out.println(info[1]);
               // System.out.println(info[2]);


                    l.add(new Cliente(nome, tel, serv));

                    System.out.println("o tamanho da lista é: " + l.size());
                }
                
                linha = bf.readLine();
            }
        
            bf.close();
        }

       
        catch (IOException es) 
        {
            System.out.println("Erro ao abrir a lista de clientes. Contate o programador Marcelo urgentemente!\n\n" + es);
        }

        
    }
    public static void main(String[] args) 
    {
        String bigBreak = "\n\n_________________________________\n\n";
        String servCli;
        final float  PATRULHA = 700f;
        final float CAMERAS = 1500f;
        float precoServ;
        

    
        List<Cliente> listaClientes = new ArrayList<>();
        
        carregaClientes(listaClientes);

        System.out.println 
        (
            bigBreak
            +   "RELATÓRIO DE CLIENTES / SERVIÇO"
            +   bigBreak
        );

        
       


        for (Cliente cliente : listaClientes)
        {
            

            servCli = cliente.getServId();

            switch (servCli)
            {
                case "1":
                {
                    precoServ = CAMERAS;
                    servCli = "Câmeras";
                    break;
                }        
                case "2": 
                {
                    precoServ = CAMERAS + PATRULHA;
                    servCli = "Câmeras e patrulha";
                    break;
                }

                default:
                precoServ = 0;
                servCli = ""; //Nào há servico contratado
            }


            System.out.printf("Cliente: " + cliente.getNome() + "\n\nPreço do servico \"%s\": US$ %.2f%s",servCli, precoServ, bigBreak);

        }


        
        
    }
}
