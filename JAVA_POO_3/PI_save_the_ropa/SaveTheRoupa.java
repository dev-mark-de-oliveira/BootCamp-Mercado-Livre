import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveTheRoupa 
{
    
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);

        String entrada; 
        GuardaRoupa GRMark = new GuardaRoupa();
        GuardaRoupa GRManu = new GuardaRoupa();

        Roupa meiasAzuis1 = new Roupa("Nike", "Meia azul");
        Roupa meiasVermelhas1 = new Roupa("SockIt", "Meia vermelha");
        Roupa meiasPretas1 = new Roupa("Mash", "Meia Preta");
        Roupa camisaBranca1 = new Roupa("Maria Joaquina", "Camisa Social College Girl");
        Roupa camisaBranca2 = new Roupa("Ganjang", "Camisa Social Xadrez M");
        Roupa camisaAzul = new Roupa("Gangster", "Camisa Social Xadrez");
        Roupa camisaBranca3 = new Roupa("Alfa Yatch", "Camisa Social Branca Lisa");
        Roupa calcaJeans1 = new Roupa("Bivik", "Calça Jeans Feminina Strass");
        Roupa calcaJeans2 = new Roupa("Bicho Solto", "Calça Jeans M ThugLife g");
        Roupa saiaJeans3 = new Roupa("BrasFashin", "Saia Jeans M");
        Roupa calcaMoleton1 = new Roupa("SEM MARCA", "Calca Moleton Preta");
        Roupa calcamoleton2 = new Roupa("Zara", "Calça Moleton preta");
       

        List<Roupa>mark_meias = new ArrayList<>();
        mark_meias.add(meiasVermelhas1);
        mark_meias.add(meiasAzuis1);

        List<Roupa>mark_camisa = new ArrayList<>();
        mark_camisa.add(camisaBranca2);


        List<Roupa>manu_camisa = new ArrayList<>();
        manu_camisa.add(camisaBranca1);

        List<Roupa>manu_saias = new ArrayList<>();
        manu_saias.add(saiaJeans3);


        GRMark.guardarRoupas(mark_camisa);
        GRMark.guardarRoupas(mark_meias);

        GRManu.guardarRoupas(manu_camisa);
        GRManu.guardarRoupas(manu_saias);

       System.out.println("\n__________GUARDA ROUPA__________________\n\n\n");
    
       System.out.println
        (
           "Caso de teste: Será inserida duas roupas!\n"
           +    "\t1 - Digite o tipo de roupa"
           +    "\t2 - Para Marcelo"
        );

        int cont = 1;
        System.out.println("\nVAMOS INSERIR DUAS PEÇAS DE ROUPAS NO GUARDA-ROUPA DA MANU!\n\n"
        +   "Veja com exclusividade o guarda-roupa dela >:-)\n\n");
        GRManu.mostrarRoupas();
        
        List<Roupa> temp = new ArrayList<>();
        String marca, tipo;

        while (cont < 3)
        {
            
            System.out.println("____________ROUPA___" + cont + "____________");
            System.out.println("\n\t1 - digite a marca de roupa para guardar lá");
            marca = input.nextLine();
            System.out.println("\n\t2 - digite o tipo de roupa (camiseta, boné, uaréver..)\n");
            tipo = input.nextLine();

            temp.add(new Roupa(marca, tipo));
            cont++;
        }

            GRManu.guardarRoupas(temp);

            System.out.println
            (
                "Veja que agora você deixou suas roupas no guarda roupa dela!"
                + "OBS: Ela além de nào notar na hora, vai depois achar que a peça é dela ><\'\n\n"
            );

            GRManu.mostrarRoupas();


            System.out.println("_________GUARDA ROUPA DO MARCELO __________\n\n");
            System.out.println("\nVAMOS REMOVER UMA LISTA DE ROUPAS NO GUARDA-ROUPA do MARK!\n\n"
            +   "Tanta bagunça! parece os códigos dele!\n\n");
            GRMark.mostrarRoupas();

            System.out.println("digite o ID da gaveta desejada");

            entrada = input.nextLine();
            
            System.out.println("Se não deu exceçào, você digitou certinho. eis o guarda roupa dele agora!");
        
            GRMark.devolverRoupas(Integer.parseInt(entrada));

            GRMark.mostrarRoupas();

            


        
        

       
        int entradaint = input.nextInt();



        
 



    }    
}
