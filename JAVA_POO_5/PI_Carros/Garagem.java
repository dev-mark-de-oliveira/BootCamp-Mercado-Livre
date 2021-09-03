package PI_Carros;

import java.util.ArrayList;
import java.util.List;
public class Garagem 
{
    
    private int controlId = 2021;
    private String id;
    private List<Vehicle> listaCarros;
    private final int limite = 1000;

    //Aqui não deixamos que o ID seja escolhido arbitrariamente! ;-)
    public Garagem()
    {
        listaCarros = new ArrayList<Vehicle>();
        id = "Gar_" + Integer.toString(controlId);
        controlId++;
    }


    public Garagem(List<Vehicle> listaCarros)
    {
        this.listaCarros = listaCarros;
        id = "Gar_" + Integer.toString(controlId);
        controlId++;
    }

    public ArrayList<Vehicle> getListaCarros()
    {
       
        ArrayList<Vehicle> ret = new ArrayList<>();
        ret.addAll(listaCarros);
        return ret;
    }

    public void addCarro(Vehicle v)
    {
        if (listaCarros.size() <= limite)
        listaCarros.add(v);
    }

    public boolean removeCarro (Vehicle v)
    {
        for(Vehicle proc: listaCarros)
        {
            if (proc.equals(v))
            {
                System.out.println("\nVeículo removido com sucesso!\n");
                return listaCarros.remove(proc);
            }
            
        }

        System.out.println("\nObjeto motorizado não localizado!\n");
        return false;
    }

    public String getId() 
    {
        return this.id;
    }

    @Override
    public String toString()
    { 
        String representation = "\n\n_______GARAGEM_" + "ID_" + getId() + "_______\n\n";

        for (Vehicle v: listaCarros)
        {
            representation += v.toString();
        }

        representation += "\n\n_________________________\n\n";

        return representation;
    }

    

    
}
