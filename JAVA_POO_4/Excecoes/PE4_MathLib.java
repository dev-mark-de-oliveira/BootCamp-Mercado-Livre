package JAVA_POO_4.Excecoes;

import java.util.Scanner;

public class PE4_MathLib
{
    public static void calculos(double a, double b)
    {
        System.out.println("\n\n__________________________________________________\n");
        System.out.printf("MÁXIMO (%.4f, %.4f) = %.4f\n\n", a, b, Math.max(a, b));
        System.out.printf("MÍNIMO (%.4f, %f) = %.4f\n\n", a, b, Math.min(a, b));
        System.out.printf("%f ^ %f = %.4f\n\n", a, b, Math.pow(a, b));
        System.out.printf("COS(%.4f°) = %.4f\n\n", a, Math.cos(a*Math.PI/180));
        System.out.printf("COS(%.4f rad) = %.4f\n\n", a, Math.cos(a));
        System.out.printf("RAIZ_QUADRADA(%.4f) = %.4f\n\n",b,  Math.sqrt(b));
        System.out.printf("ALEATORIO[0, 999] = %.0f\n\n", Math.floor(1000*Math.random()));
        System.out.println("\n\n__________________________________________________\n");
    }
    public static void main(String[]args)
    {
        String entrada = "";
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        
        try
        {
            System.out.println("\n\nDigite um número \"a\" para retornarmos alguns cálculos sobre a ou com b.");
            entrada = input.nextLine();
        
            a = Double.parseDouble(entrada);

            System.out.println("\nDigite um número \"b\" para retornarmos alguns cálculos");
            entrada = input.nextLine();
        
            b = Double.parseDouble(entrada);
            calculos(a,b);
        }

        catch(NullPointerException npe)
        {
            System.out.println
            (
                "Nenhum número passado ap programa!\n"
                + "[ " + npe.getLocalizedMessage() + " ]\n"
            );

        }

        catch(NumberFormatException nfe)
        {
            System.out.println
            (
                "\n\nVocê não digitou um número!"
                + "[ "+ nfe.getLocalizedMessage() + "]\n"
            );
        }

        finally
        {
            System.out.println("\n\n______SAINDO DO PROGRAMA______\n\n");
            input.close();
        }



    }
}