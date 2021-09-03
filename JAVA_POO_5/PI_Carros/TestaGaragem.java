package JAVA_POO_5.PI_Carros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestaGaragem 
{

    public static void carregaLista(List<Vehicle> l) throws FileNotFoundException, IOException, IllegalArgumentException, NullPointerException, NumberFormatException  
    {
        final String sepRegEx = ";";
        String linha = "";
        
        BufferedReader bufferedReader = new BufferedReader ( new FileReader("JAVA_POO_5/PI_Carros/lista_carros.txt"));
        
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

    public static void ordenadoLambda_Valor(Garagem g)
    { 
        System.out.println("VAMOS ORDENAR PELO PREÇO USANDO NOTAÇÃO LAMBDA!\n\n");

        ArrayList<Vehicle> ret =  g.getListaCarros();

        ret.stream().sorted(Comparator.comparingDouble(Vehicle::getValor)).collect(Collectors.toList()).forEach(System.out::println);;

    }

    public static void ordenadoLambda_Marca_Valor(Garagem g)
    { 
        System.out.println("VAMOS ORDENAR PELA MARCA E DEPOIS PELO PREÇO USANDO NOTAÇÃO LAMBDA!\n\n");

        ArrayList<Vehicle> ret =  g.getListaCarros();

        ret.stream().sorted(Comparator.comparing(Vehicle::getMarca).thenComparing(Vehicle::getValor)).collect(Collectors.toList()).forEach(System.out::println);;

    }

    public static void filtroMenorQueMil(Garagem g)
    {
        System.out.println("VAMOS FILTRAR OS CARROS CUJO PREÇO NÃO CHEGAM A R$ 1000.!\n\n");

        ArrayList<Vehicle> ret =  g.getListaCarros();

        ret.stream().filter(x -> x.getValor() < 1000).collect(Collectors.toList()).forEach(System.out::println);

    }

    public static void filtroMaiorOuMil(Garagem g)
    {
       
        System.out.println("VAMOS FILTRAR OS CARROS CUJO PREÇO É R$ 1000 OU MAIS.!\n\n");

        ArrayList<Vehicle> ret =  g.getListaCarros();

        ret.stream().filter(x -> x.getValor() >= 1000).collect(Collectors.toList()).forEach(System.out::println);

    
    }

    public static void reduzMedia(Garagem g)
    {
        System.out.println("Por fim, a média do valor de todos os carros!\n\n");

        ArrayList<Vehicle> ret =  g.getListaCarros();

        double media = ret.stream().mapToDouble(Vehicle::getValor).average().orElse(Double.NaN);

        System.out.printf("R$ %.2f\n\n", media);
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

                
                ordenadoLambda_Valor(g);
                ordenadoLambda_Marca_Valor(g);
                
                filtroMenorQueMil(g);

                //complemento
                filtroMaiorOuMil(g);

                reduzMedia(g);
                
                
            }
            else System.out.println("\n\nARQUIVO VAZIO! SAINDO DO PROGRAMA >:-().\n\n");
        }

    }
}
