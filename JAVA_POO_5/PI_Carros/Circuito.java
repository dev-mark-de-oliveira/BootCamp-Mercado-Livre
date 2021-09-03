package JAVA_POO_5.PI_Carros;
public  class Circuito
{
    private final int km_dis;
    private boolean selva;
    private boolean rio;
    private boolean lama;
    private boolean escalada;

    public boolean isEscalada() {
        return this.escalada;
    }

    public void setEscalada(boolean escalada) {
        this.escalada = escalada;
    }

    private double preco;

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }



    public Circuito (int km_dis, boolean selva, boolean rio, boolean lama, boolean escalada, double preco)
    {
        this.km_dis = km_dis;
        this.selva = selva;
        this.rio = rio;
        this.lama = lama;
        this.escalada = escalada;
        this.preco = preco;

    }

    public int getKm_dis () {
		return this.km_dis;
	}

   

    public boolean isSelva() {
        return this.selva;
    }

   
    public boolean isRio() {
        return this.rio;
    }

   

    public boolean isLama() {
        return this.lama;
    }


}

 class PeqCirc extends Circuito 
{
    
    final private double PRECO;

    public double getPreco() {
        return PRECO;
    }

    public PeqCirc (double preco)
    {
        
        super(2, true, false, false, false, preco);
        PRECO = preco;
    }
}

 class MedCirc extends Circuito 
{
    final private double PRECO;

    public double getPreco() {
        return PRECO;
    }


    public MedCirc (double preco)
    {
        super(2, true, true, true, false, preco);
        PRECO = preco;
    }
}

 class AdvCirc extends Circuito
{
    final private double PRECO;

    public double getPreco() {
        return PRECO;
    }

    public AdvCirc(double preco)
    {
        super(2, true, true, true, true, preco);
        PRECO = preco;
    }
}
