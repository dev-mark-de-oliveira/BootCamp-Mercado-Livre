import java.util.Scanner;
import java.io.IOException;

public class Aula4Ex3 
{
    public static int calculaPreco (int dia, int taxa)
        {
            return taxa*dia;
        }

        public static void main (String[]args)
        {

        
            int dias, preco;
            final int taxa = 2;


            Scanner input = new Scanner(System.in);
        
            System.out.println("\n--------------------------------------------\n");
            System.out.println("\n\ndigite o número de dias trabalhados");
            dias = input.nextInt();

            preco = calculaPreco(dias, taxa);
        
            System.out.printf("\npara %d dias trabalhados, o preço é: R$%d,00.", dias, preco);
            System.out.println("\n\n--------------------------------------------\n");
        }
}
