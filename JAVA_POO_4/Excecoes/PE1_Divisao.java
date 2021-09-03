package JAVA_POO_4.Excecoes;
public class PE1_Divisao 
{

        

    
    public static double divide (int a, int b) throws Exception
    {
        System.out.printf("\ndividindo %d por %d:\n\n", a, b);
        
        if (b == 0)
        {
            if (a == 0)
            {
                throw new IllegalArgumentException("\n\nZero dividido por zero é indeterminado!\n"
                    + "Se você está usando uma função ƒ:(x, y | ƒ(a) = b) que tem limite "
                    + "no ponto (a, b) verifique se é pertinente usá-lo "
                    +"no lugar desta divisão.\n\n");
            }

            else
            {
                throw new ArithmeticException("\n\nImpossível dividir um número diferente de zero por zero!\n\n");
            }
        }
        return (double)a/(double)b;
    }
    public static void main(String[] args)
    
    {
        
        

        int a = 300;
        int b = 0;
        double result;
        
        try
        {
            System.out.printf("\n\nA divisão de %d por %d é %f.\n\n", a, b, divide(a, b));   
        }

        catch  (Exception e)
        {
            System.out.println
            (
                "Não foi possível obter um valor numérico da divisão!"
                + e.getMessage()
            );
        }
        
        finally
        {
            System.out.println("\n____________PROGRAMA FINALIZADO____________\n");
        }
        
    }

}





