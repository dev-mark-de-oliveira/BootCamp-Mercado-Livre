package JAVA_POO_2.Estrutura_Controle_Arranjos.Ex1;

public class Ex1 
{
    public static void main(String[] args) 
    {

        int lin, col, min, max;
        String minCidade, maxCidade;

        String[] cidades = 
        {
            "Londres"           ,
            "Madrid"            ,
            "Nueva York"        ,
            "Buenos Aires"      , 
            "Assunción"         , 
            "São Paulo"         , 
            "Lima"              , 
            "Santiago de Chile" , 
            "Lisboa"            , 
            "Tokio"
        };

        int[][] temperaturas =
        {
            {   -2  , 33  },
            {   -3  , 32  },
            {   -8  , 27  },
            {    4  , 37  },
            {    6  , 42  },
            {    5  , 43  },
            {    0  , 39  },
            {   -7  , 26  },
            {   -1  , 31  },
            {  -10  , 35  }
        };

        col = temperaturas[0].length;
        lin = temperaturas.length;

        min         = temperaturas[0][0];
        max         = temperaturas[0][1];
        minCidade   = cidades[0];
        maxCidade   = cidades[0];
        
        for (int i = 1; i < lin; i++)
        {
            if (temperaturas[i][0] < min)
            {
                min = temperaturas[i][0];
                minCidade = cidades[i];
            }

            if (temperaturas[i][1] > max)
            {
                max = temperaturas[i][1];
                maxCidade = cidades[i];
            }
        }

        System.out.printf
        (
            "\n\n"
            + "A menor temperatura registrada foi de %d°C "
            + "na cidade de %s.\n\n"
            + "E a maior temperatura registrada foi de %d°C "
            + "na cidade de %s.\n\n",
            
            min, minCidade, max, maxCidade

        );

    }    
}
