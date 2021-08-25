import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aula5Ex4 
{
    public static void carregaLista(List<Entrevistado> l)
    {
        String linha;
        String nome, a, b, c;

        //Nome, jornal A, jornal B, jornal C
        String[] dados = new String[4];
        

        try
        {
           
            File f = new File("dados_pesquisa.txt");
            BufferedReader bf = new BufferedReader(new FileReader(f));
            
            //Lendo linha por linha

            linha = bf.readLine();
            while (linha != null)
            {
                if(linha.length() > 0)
                {
                    
                    dados   = linha.split(";");

                    nome    = dados[0];
                    a       = dados[1];
                    b       = dados[2];
                    c       = dados[3];

                
                //System.out.println(info[0]);
               // System.out.println(info[1]);
               // System.out.println(info[2]);


                    l.add(new Entrevistado(nome,  Boolean.parseBoolean(a), Boolean.parseBoolean(b), Boolean.parseBoolean(c)));

                    //System.out.println("o tamanho da lista é: " + l.size());
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

    public static Set<Entrevistado> interseccao (Set<Entrevistado> a, Set<Entrevistado> b)
    {
        Set<Entrevistado> result = new HashSet<>();
        result.addAll(a);
        result.retainAll(b);

        return result;
    }

    public static Set<Entrevistado> complemento (Set<Entrevistado> universo, List<Set<Entrevistado>> l ) 
    {
        Set<Entrevistado> result = new HashSet<Entrevistado>();
        result.addAll(universo);

        for (Set<Entrevistado> s: l) 
        {
            result.removeAll(s);
        }
        
        return result;
    }
    
    public static void main(String[] args) 
    {
        int contA = 0, contB = 0, contC = 0;
        String bigBreak = "\n\n__________________________________________\n\n";

        List<Entrevistado> listaEntrevistados = new ArrayList<>();
        carregaLista(listaEntrevistados);
        
        Set<Entrevistado> universo  = new HashSet<>();
        Set<Entrevistado> conjuntoA = new HashSet<>();
        Set<Entrevistado> conjuntoB = new HashSet<>();
        Set<Entrevistado> conjuntoC = new HashSet<>();

        Set<Entrevistado> resultSet = new HashSet<>();

        List<Set<Entrevistado>> conjuntos = new ArrayList<>();
        


        for (Entrevistado e : listaEntrevistados)
        {
            universo.add(e);
            if (e.isA()) conjuntoA.add(e);
            if (e.isB()) conjuntoB.add(e);
            if (e.isC()) conjuntoC.add(e);

        }

        conjuntos.add(conjuntoA);
        conjuntos.add(conjuntoB);
        conjuntos.add(conjuntoC);


        System.out.println(bigBreak + "Resultados da Pesquisa" + bigBreak);

        System.out.printf("%sLeitores do jornal \"A\": %d", bigBreak, conjuntoA.size());
        System.out.printf("%sLeitores do jornal \"B\": %d", bigBreak, conjuntoB.size());
        System.out.printf("%sLeitores do jornal \"C\": %d", bigBreak, conjuntoC.size());
        System.out.printf("%sLeitores dos jornais \"A\" e \"B\": %d", bigBreak, interseccao(conjuntoA, conjuntoB).size());
        System.out.printf("%sLeitores dos jornais \"A\" e \"C\": %d", bigBreak, interseccao(conjuntoA, conjuntoB).size());
        System.out.printf("%sLeitores do jornais \"B\" e \"C\": %d", bigBreak, interseccao(conjuntoA, conjuntoB).size());
        System.out.printf("%sLeitores do jornais \"A, \"B\" e \"C\": %d", bigBreak, interseccao(conjuntoA, interseccao(conjuntoB, conjuntoC)).size());
        System.out.printf("%sTotal de leitores de nenhum dos jornais: %d%s", bigBreak, complemento(universo, conjuntos).size(), bigBreak);

    }
  
}
