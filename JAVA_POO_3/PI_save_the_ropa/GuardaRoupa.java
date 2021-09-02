import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class GuardaRoupa 
{
    private Map<Integer, List<Roupa>> mapa = new HashMap<>();
    private int id = 0;    

    public GuardaRoupa(List<Roupa> l)
    {
        mapa.put(id,l);
        ++id;
    }

    public GuardaRoupa()
    {
        ;
    }

    public int guardarRoupas(List<Roupa> listaDeRoupas)
    {
        
        mapa.put(id,listaDeRoupas);
        return ++id;
    }

    public void mostrarRoupas()
    {
        
            { 
                for(Map.Entry<Integer, List<Roupa>> entry : mapa.entrySet())
                {
                    System.out.println("\n");

                    int id = entry.getKey();
                    List<Roupa> lista = entry.getValue();
                    System.out.println("ID da gaveta: " + id + "\n");
                    for (Roupa r: lista)
                    {    
                        System.out.println("[ " + "MODELO: " + r.getModelo() + "\tMARCA: " + r.getMarca() + " ]");
                    }
                    System.out.println("\n");
                }
            }    
    }

    public List<Roupa> devolverRoupas(Integer numero)
    {
        return mapa.remove(numero);
    }

    


}
