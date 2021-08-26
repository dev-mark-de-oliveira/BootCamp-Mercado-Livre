import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CorridaNaSelva {

    static String line = "\n_____________________________";
    static String bigBreak = "\n\n" + line + "\n\n";

    public static void exibeMenuInicial()
    {
        System.out.println
            (
                    "1 - Cadastrar um corredor;\n\n"
                +   "2 - Consultar participantes em determinada categoria;\n\n"
                +   "3 - Cancelar uma inscrição numa categoria;\n\n"
                +   "0 - Sair;\n\n\n" 
                
            );
    }
   
    public static void cadastraPart()
    {
        System.out.println
        (
                bigBreak
            +   "        CADASTRAR USUÁRIO       "
            +   line
        );
    
    
    }

    public static void cancelaPart ()
    {
        System.out.println("cancela");
    }

    public static void consultaCat()
    {
        System.out.println("consulta");
    }


    public static void main(String[] args) 
    {

        List<Participante> listaGeral = new ArrayList<>();
         

        int cont = 0;

        //carrega a lista de inscritos e determina o id de inscrição 


        String entrada = "";
        String bigBreak = "\n\n_______________________________\n\n";
        System.out.println(bigBreak + "    ______CORRIDA SELVA_____    " + bigBreak);

        System.out.println("Escolha uma opção: " + bigBreak);
        
        
        boolean continua = true;
        
        Scanner input = new Scanner (System.in);
        
        do
        {
            exibeMenuInicial();

            entrada = input.next();

            switch (entrada)
            {
                case "1":
                
                    cadastraPart();
                    break;
                
            
                case "2":
                
                    consultaCat();
                    break;
                
            
                case "3":
                
                    cancelaPart();
                    break;

                case "0":    

                    continua = false;
                    break;

                default:
                
                    
                    break;

            
            }


        } while (continua);


        
    }
}
