import java.io.LineNumberInputStream;
import java.util.Scanner;
import java.io.IOException;
//import jdk.javadoc.internal.doclets.formats.html.resources.standard;
public class Aula4Ex4
{


    
    public static void main (String[]args) 
    {
        double premio;

        Scanner input = new Scanner(System.in);

        String delimit = "\n--------------------------------------------\n\n";

        final double taxa1 = 0.0245;
        final double taxa2 = 0.15;
        final double taxa3 = 0.03;

        double ptx1, ptx2, ptx3, total;

        System.out.println("\n--------------------------------------------\n");
        
        System.out.println("Digite o valor do prêmio para o cálculo das taxas!\n");

        premio = input.nextDouble();

        ptx1 = premio*taxa1;
        ptx2 = premio*taxa2;
        ptx3 = premio*taxa3;
        
        
        double txtotal = ptx1+ptx2+ptx3;
        double premLiq = premio - txtotal;

        



        System.out.println("\n\n\n--------------------------------------------\n");
        System.out.printf("Sobre seu prêmio de %.2f são cobradas:\n\n", premio);
        
        

        System.out.printf
        ( "taxa1:\tR$ %.2f\ntaxa2:\tR$ %.2f\ntaxa3:\tR$ %.2f\n\n",

                premio*taxa1,
                premio*taxa2,
                premio*taxa3

        );

        
        System.out.printf("\nTOTAL:\tR$ %.2f\n%sPRÊMIO LÍQUIDO:\t\t\tR$ %.2f\n", txtotal, delimit, premLiq);
        System.out.println(delimit+ "\n");
        
        /*
        int dias, preco;


        Scanner input = new Scanner(System.in);
        

        System.out.println("\n\ndigite o número de dias trabalhados");
        int dias = input.nextInt();

        preco = calculaPreco(dias);
        
        System.out.printf("\npara %d dias trabalhados, o preço é: R$%d,00", dias, preco);


        */
    
    }

    
    
}