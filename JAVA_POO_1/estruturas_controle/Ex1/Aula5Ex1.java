import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Aula5Ex1 
{
    
    public static void calcula (Fabrica f, float preco, int margem)
    {

        float precoCusto = preco + preco * (f.getPorcCEnv()) / 100;

        float precoVenda = precoCusto + precoCusto * margem / 100;

        String separador = "\n_____________________________\n";
        

        System.out.printf("\n%s\nCusto de produção da fábrica %d: R$ %.2f\n\n", separador, f.getId_num(), preco);
        System.out.printf("Porcentagem do frete Fábrica %d: %d%%\n\n", f.getId_num(), f.getPorcCEnv());
        System.out.printf("\nPRECO LÍQUIDO: R$ %.2f\n%s", precoCusto, separador);
        System.out.printf("\n Margem de lucro: %d%%\n", margem);
        System.out.printf("\n PREÇO DE VENDA: R$ %.2f", precoVenda);
        System.out.println("\n" + separador + "\n");



    }
    
    public static void main (String[]args)
    {

        float preco;
        String resp;
        final int margem = 25;
        


        Scanner input = new Scanner(System.in);

        Fabrica Fab1 = new Fabrica(1, 500, 7);
        Fabrica Fab2 = new Fabrica(2, 780, 15);
        Fabrica Fab3 = new Fabrica(3, 1200, 22);

        List<Fabrica> listaFabricas = new ArrayList<>();

        listaFabricas.addAll(Arrays.asList(Fab1, Fab2, Fab3));
        


        

        System.out.println("\n\nDigite o preço de custo");
        preco = input.nextFloat();

        System.out.println ("\nDigite a fábrica escolhida (1, 2 ou 3).\nOu \'q\' para sair\n");



        do
        {
            resp = input.next();

            if (resp.equals("q")) 
            {
                System.out.println("\nsaindo do programa");
                return;
            }
            if (resp.equals("1") || resp.equals("2") || resp.equals ("3"))
            {
                break;    
            }
                       

            System.out.println("Número inválido! Tente novamente.");

        } while (true);

for (Fabrica fabrica : listaFabricas)
    {
        if (Integer.toString(fabrica.getId_num()).equals(resp))
        {
            calcula(fabrica, preco, margem);
            break;
        }

    }


    }    

}
