package Produtos;


public class Pereciveis extends Product {

    private int daysPorCaducar;

    public int getDaysPorCaducar() 
    {
        return this.daysPorCaducar;
    }

    public void setDaysPorCaducar(int daysPorCaducar) 
    {
        this.daysPorCaducar = daysPorCaducar;
    }
    
    public Pereciveis (String name, double price, int quantidadeOfProdutos, int daysPorCaducar)
    
    {
        super(name, price, quantidadeOfProdutos);
        this.daysPorCaducar = daysPorCaducar;
    }

    @Override
    public double calcule ()
    {
        double valorProd = super.calcule();

        switch (daysPorCaducar)
        {
            case 1:
            {
                
                valorProd /= 4;
                break;
            }

            case 2:
            {
                valorProd /= 3;
                break;
            }

            case 3:
            {
                valorProd /= 2;
                break;
            }

            default:
            break;

        }
    
        return valorProd;
    
    }

    @Override
    public String toString() 
    {
        return 
                     
            super.toString()
            +   "\td_venc.:  "
            + daysPorCaducar;
                
                // return super.toString + "\tvalidade:\t " + daysPorCaducar
    }

    
}
