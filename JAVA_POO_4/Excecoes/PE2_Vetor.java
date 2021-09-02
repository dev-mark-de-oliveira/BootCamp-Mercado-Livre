package Excecoes;

public class PE2_Vetor 
{
    public static void main(String[]args)
    {
        String mensagemFinal = "Esta é a última mensagem.";
        int[] numeros = new int[5];
        try
        {
            numeros[5] = 10;
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nErro: acesso a posicão fora do vetor.\n\n(" + e.getLocalizedMessage() + ")\n");
        }

        finally
        {
            

            System.out.println(mensagemFinal + "\n");
        }
        
    }    
}
