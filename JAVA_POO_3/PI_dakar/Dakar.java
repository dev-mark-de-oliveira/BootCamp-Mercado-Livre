package JAVA_POO_3.PI_dakar;

import java.util.ArrayList;
import java.util.List;

public class Dakar 
{
    public static void vencedor(Corrida c, CarroSocorrista cs, MotoSocorrista ms)

    {

        String vencedores = ""; 
        double max = Double.MIN_VALUE;
        double result;

        System.out.println("\n________________________________________________\n\n" + "CORRIDA " + c.getNOME() + "\n\n");
        if (c.getLista().size() > 0)
        { 
            for(Veiculo v : c.getLista())
            {
                if (v instanceof Moto || v instanceof Veiculo)
                {
                    result = v.getResultado();

                    if (v instanceof Moto)
                    {
                        ms.socorrer((Moto)v);
                    }

                    else
                    {
                        cs.socorrer((Carro)v);
                    }
                }
                else return;

                if (result > max)
                {
                    vencedores = v.getPlaca();
                    max = result;
                }

                else if( result == max )
                { 
                    vencedores += "\n" + v.getPlaca();
                }
            }

            System.out.println("\nOs vencedores são\n" + vencedores + "\n________________________________________________\n\n");
        }
    }
    public static void main(String[] args)
    { 
        CarroSocorrista cs = new CarroSocorrista(34, 45, 23, "CSO1422");
        MotoSocorrista ms = new MotoSocorrista(34, 45, 23, "MSC3294");

        List<Veiculo> lista_teste_1 = new ArrayList<>();
        List<Veiculo> lista_teste_2 = new ArrayList<>();
        List<Veiculo> lista_teste_3 = new ArrayList<>();
        
        lista_teste_1.add(new Carro(45, 30,  23, "AXP3456"));
        lista_teste_1.add(new Moto(50, 20,  49, "FGB6723"));
        lista_teste_1.add(new Carro(15, 50,  12, "QWE4888"));
        lista_teste_1.add(new Moto(11, 22,  80, "BVC5426"));
        lista_teste_1.add(new Carro(60, 30,  20, "ETR3426"));
        lista_teste_1.add(new Moto(45, 100, 45, "EEP0900"));

        lista_teste_2.add(new Moto(65, 20,  8, "FGB6723"));
        lista_teste_2.add(new Moto(65, 20,  8, "MZP5546"));
        lista_teste_2.add(new Moto(69, 0, 25, "MAO0981"));



        lista_teste_3.add(new Carro(15, 50,  12, "QWE4888"));
        lista_teste_3.add(new Carro(20, 30,  5, "ETR3426"));

        Corrida c1 = new Corrida(40, 500000.0, "Weingarten Lola rennt", 3, lista_teste_1);
        Corrida c2 = new Corrida(60, 1500000.0, "Bangu GP", 10, lista_teste_2);
        Corrida c3 = new Corrida(40, 500000.0, "Lula2022", 2, lista_teste_3);


        System.out.println("\n\n");

        vencedor(c1, cs, ms);
        vencedor(c2, cs, ms);
        vencedor(c3, cs, ms);

        



    }    
}
