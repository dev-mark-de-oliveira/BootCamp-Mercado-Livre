public class CircuitoPequeno extends Circuito

{
    
    private double preco;

    public CircuitoPequeno (double preco)
    {
        this.preco = preco;
        super(2, true, false, false, false, preco);
        
    }
}