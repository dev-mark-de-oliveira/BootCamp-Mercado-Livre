

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
    
    public Pereciveis (String name, double price, int daysPorCaducar)
    
    {
        super(name, price);
        this.daysPorCaducar = daysPorCaducar;
    }

    @Override
    public double calcule (int quantidadeOfProdutos)
    {
        double valorProd = super.calcule(quantidadeOfProdutos);

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
        return "Product{" +
                "\tnome:\t" + super.getName() + "\n" +
                "\tpreco:\t " + super.getPrice() +
                "\tdias para vencimento:\t " + daysPorCaducar +
                "\n}";
                
                // return super.toString + "\tvalidade:\t " + daysPorCaducar
    }

    
}
