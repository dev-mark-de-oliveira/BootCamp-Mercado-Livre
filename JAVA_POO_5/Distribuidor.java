import java.util.ArrayList;
import java.util.List;

public class Distribuidor 
{
    
    public static void main(String[] args) 
    {

        List<Product> listaProdutos = new ArrayList<>();        
        
       
        //Nome, Preco, quantidade, dia_vec (p) /tipo (np)
       listaProdutos.add(new Pereciveis( "Vigor", 10, 1, 3));
       listaProdutos.add(new Pereciveis( "Yakult", 10, 1, 3));
       listaProdutos.add(new Pereciveis( "Pessego", 10, 1, 3));
       listaProdutos.add(new Pereciveis( "Alface", 10, 1, 3));
       listaProdutos.add(new Pereciveis( "Banana", 10, 1, 3));


       listaProdutos.add(new NonPerishible("Arroz", 20, 20, "grão"));
       listaProdutos.add(new NonPerishible("Feijão", 15.00, 100, "grão"));
       listaProdutos.add(new NonPerishible("Soja", 8.00, 10, "grão"));
       listaProdutos.add(new NonPerishible("Sabão em pó", 7.00, 30, "produto de limpeza"));
       listaProdutos.add(new NonPerishible("Panela", 25.00, 10, "Utensílio Cozinha"));// System.out.println

       
       double totalPer = 0.0;
       double totalNaoP = 0.0;
       
       
       String separador = "\n________________________________________\n\n";
        
       String saida = 
             separador
        +    "NOME"
        +   "\tPRECO"
        +   "\tQUANT."
        +   "\tTIPO / DV\n"
        + separador;

        for (Product p : listaProdutos)
        {

            if (p instanceof Pereciveis)
            { //
                totalPer += p.calcule();
            }

            else 
            {
                totalNaoP += p.calcule();
            }

        }      

            System.out.println("\n\nTotal perecíveis: " + totalPer + "\n\nTotal Nao perecíveis:" + totalNaoP +  "\n\n");
           //System.out.println(saida);
        
        // (
        //     danone.calcule(10)
            
        // );

    }


}
