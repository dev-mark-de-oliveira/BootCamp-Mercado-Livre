

public class Fabrica 
{
    private int id_num;
    private int dist_km;
    private int porc_CEnv;


    public Fabrica (int id_num, int dist_km, int porc_CEnv)
    {
        this.id_num = id_num;
        this.dist_km = dist_km;
        this.porc_CEnv = porc_CEnv;
    }    

    public int getId_num()
    {
        return id_num;
    }

    public int getDistKm()
    {
        return dist_km;
    }

    public int getPorcCEnv()
    {
        return porc_CEnv;
    }



}
