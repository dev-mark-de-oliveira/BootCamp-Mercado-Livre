package PI_Carros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestaGaragem 
{

    public static void carregaLista(List<Vehicle> l) throws FileNotFoundException, IOException, IllegalArgumentException, NullPointerException, NumberFormatException  
    {
        final String sepRegEx = ";";
        String linha = "";
        
        BufferedReader bufferedReader = new BufferedReader ( new FileReader("lista_carros.txt/"));
        
        while((linha = bufferedReader.readLine()) != null) 
        {
            String [] parts = linha.split(sepRegEx);

            if (parts.length != 3) 
            {
                bufferedReader.close();
                throw new IOException ("Arquivo corrompido!\n Contate o programador Marcelo!");
            }
        

            l.add(new Vehicle(parts[0], parts[1], Double.parseDouble(parts[2])));

        }
        bufferedReader.close();
        
    }

    public static void ordenadoPorLambda(Garagem g)
    { 
        ArrayList<Vehicle> ret =  g.getListaCarros().stream().sorted(Vehicle x, Vehicle y -> x.getValor().compareTo(y.getValor()));
    }

    public static void main(String[] args)
    {
        List<Vehicle> l = new ArrayList<Vehicle>();
        Garagem g;
        try
        {
            
            carregaLista(l);

        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println
            (   "Arquivo não Encontrado!\n\n"
                + "("+ fnfe.getLocalizedMessage() + ")\n"
            );
        }

        catch (IOException ioe)
        {
            System.out.println
            (   "Arquivo corrompido ou erro na leitura!\n\n"
                + "("+ ioe.getLocalizedMessage() + ")\n"
            );
        }
        finally
        {   if (l.size() > 1)

            {
                g = new Garagem(l);
                System.out.println("\n\n"+ g.toString() +"\n\n");

                System.out.println("VAMOS ORDENAR PELO PREÇO USANDO NOTAÇÃO LAMBDA!\n\n");
                
                ordenadoPorLambda(g);
                
                
            }
            else System.out.println("\n\nARQUIVO VAZIO! SAINDO DO PROGRAMA >:-().\n\n");
        }

    }
}
