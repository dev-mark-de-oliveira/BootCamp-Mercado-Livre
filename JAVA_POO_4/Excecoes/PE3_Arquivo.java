package Excecoes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PE3_Arquivo 
{
    public static void lerArquivo(String nomeArquivo) throws FileNotFoundException, IOException 
    {
        String texto = null;
        
        BufferedReader bufferedReader = new BufferedReader ( new FileReader(nomeArquivo));
        
        while((texto = bufferedReader.readLine()) != null) 
        {
            System.out.println(texto);
        }
        bufferedReader.close();
        
    }

    public static void lerArquivoErrado(String nomeArquivo) throws FileNotFoundException, IOException 
    {
        System.out.println(
            "\nAgora vamos testar o método alterado, "
            +   "que tem um bufferedReaderclose() após a leitura da primeira linha\n");
        String texto = null;
        
        BufferedReader bufferedReader = new BufferedReader ( new FileReader(nomeArquivo));
        
        int linhas = 70;
        while(linhas > 0) 
        {   
            texto = bufferedReader.readLine();
            System.out.println(texto);
            bufferedReader.close();
            --linhas;
        }
        
        bufferedReader.close();

    }


    public static void main(String[] args)
    {
        String arquivoInexistente = "arquivoinexistente.txt";
        String cores = "cores.txt";

        try
        {   System.out.println("\nTentando ler o arquivo: \""+ arquivoInexistente +"\"");
            lerArquivo(arquivoInexistente);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("\n\nO arquivo \"" + arquivoInexistente + "\" especificado não foi encontrado!\n");
        }
        catch(IOException ioe)
        {
            System.out.println("Erro ao ler o arquivo especificado!\n");
        }

        finally
        {
            System.out.println("Tentando ler o arquivo \'cores.txt\'");
            try
            {
                lerArquivoErrado(cores);
            }

            catch(FileNotFoundException fnfe)
            {
                System.out.println("\n\nO arquivo \"" + cores + "\" especificado não foi encontrado!\n");
            }
            catch(IOException ioe)
            {
                System.out.println("\nErro ao ler o arquivo especificado!\n");
            }

            finally
            {
                System.out.println("\nFinalizando o programa.\n\n" + "\n");
            }
                
        }
        


    }

}
