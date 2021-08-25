import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Aula5Ex2 
{ 
    public static float acrescimoEmPorcentagem (float f)
    {
        return (f - 1)* 100;
    }
    public static void main(String[] args) 
    {
        String rg;
        String bigBreak = "\n\n____________________________________\n\n";      
        
        float salario;
        float aumento;

        Scanner input = new Scanner(System.in);


        System.out.println("Digite o RG do Funcionário. Sujeito a verificação posterior!\n");

        rg = input.next();

        System.out.println("Digite o salário do funcionário");

        salario = input.nextFloat();

        if (salario < 45000.00)
        {
            aumento = 1.05f;
        }

        else if (salario >= 20000.00)
        {
            aumento = 1.20f;
        }

        else aumento = 1.10f;
        
        System.out.printf
        (
            "\n\nPara o funcionário identificado pelo RG %s "
            + "de salário R$ %.2f a taxa de %.2f%%.\n\n"
            + "Logo, seu salário final será de R$ %.2f",
            rg,
            salario,
            acrescimoEmPorcentagem(aumento),
            aumento*salario

            
        );
        //corrigir!
    }    
}
