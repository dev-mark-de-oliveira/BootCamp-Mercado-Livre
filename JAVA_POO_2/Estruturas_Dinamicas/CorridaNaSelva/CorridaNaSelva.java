package JAVA_POO_2.Estruturas_Dinamicas.CorridaNaSelva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;




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

    
    public static void cadastraPart(List<Participante> l)
    {

        String entrada                  =   "";
        int entradaInt                        ;
        String rG                       =   "";
        String nome                     =   ""; 
        String sobrenome                =   "";
        int idade                             ; 
        String telefoneProprio          =   ""; 
        String telefoneEmergencia       =   "";
        String tipoSang                 =   "";
        Circuito c                      = null;
        int codInscr                    = l.get(l.size()-1).getCodInscr()+1;
        float taxa                            ;
     
                   

        


        Scanner inp2 = new Scanner(System.in);
        
        System.out.println
        (
                bigBreak
            +   "        CADASTRAR USUÁRIO       "
            +   line

        );

        int cont = 0;
        do{
            System.out.println("\n\nDigite seu nome completo, separado por espaço");
            entrada = inp2.nextLine();


            String[] nomeC = entrada.split(" ");
            if (nomeC.length < 1)
            {
                cont++;
                if (cont == 3)
                {
                    System.out.println("Número de tentativas excedido! Saindo do programa!\n");
                    return;
                }
                System.out.println("Campo vazio ou nome incompleto!\n");
            }
            else
            {
                nome = nomeC[0];

                for (int i = 1; i < nomeC.length; i++)
                {
                    sobrenome += nomeC[i] + " ";
                }
                
                cont = 3;

            } 
            
            
            

        } while (cont < 3);
    
        System.out.println("Digite seu RG sem espaços");
        entrada = inp2.next();
        //validacao
        rG = entrada;


        System.out.println("Selecione seu tipo Sanguíneo\n\n1 - A\n2 - B\n3 - O\n4 - Não Sei");
        entradaInt = inp2.nextInt();
        
        switch(entradaInt)
        {
            case 1: 
                tipoSang = "A";
                break;
            
            case 2:
                tipoSang = "B";
                break;

            case 3:
                tipoSang = "O";
                break;
                
            default:
            
                System.out.println
                (
                    "Esta informaçao é necessária!"
                    +   "Sua inscrição não será feita até que nos traga o comprovante de TS\n\n"
                );

                return;
            
        }

        System.out.println("Digite sua idade");
        {
          entradaInt = inp2.nextInt();
          //validar
          idade = entradaInt;   
        }

        System.out.println("Digite seu telefone");
        entrada = inp2.next();
        //Validar()
        telefoneProprio = entrada;

        System.out.println("Digite um telefone de emergência");
        entrada = inp2.next();
        //Validar()
        telefoneEmergencia = entrada;

        //comparar telefones se se sao iguais

        //oferecer opcoes de corridaNaSelva
        
        
        
        final boolean SELVA = true;
        
        final boolean RIACHO = true;

        boolean lama = false;
        boolean escalada = false;

        
        if (idade < 18)
        {
            escalada = false;
            System.out.println
            (
                    "Parabéns, " + nome + "!\n\n"
                +   "Oferecemos para seu perfil estas modalidades:\n\n"
                +   "1 - Pequeno circuito: 2 km por selva e riachos. - R$ 1300,00\n"
                +   "2 - Médio circuito: 2 km por selva e riachos + lama. - R$ 2000,00\n"   

            );
        }

        else
        {
            System.out.println
            (
                "Parabéns, " + nome + "!\n\n"
                +   "Oferecemos para seu perfil estas modalidades:\n\n"
                +   "1 - Pequeno circuito: 2 km por selva e riachos. - R$ 1500,00\n"
                +   "2 - Médio circuito: 2 km por selva, riachos, lama e escalada em rocha. - R$ 2300,00\n"
                +   "3 - Circuito Avançado: 2 km por selva e riachos + lama. - R$ 2300,00\n"
            );
        }

        System.out.println
        (
            "\n\nVocê deseja se increver? Digite o número do circuito desejado, ou \"0\" para sair.\n"
        );

        
        cont = 0;
        do
        {   if (cont == 3)
            {
                System.out.println
                (
                        "Números de tentativas excedido!"
                    +   "Saindo do programa!"
                );

                return;
            }

            entrada = inp2.next();

            if (!entrada.matches("[0-3]{1}"))
            {
                cont++;
                System.out.println("Código inválido! Tente novamente.");
            }

            else
            {
                if (idade < 18 && !entrada.matches("[0-2]{1}"))
                {
                    cont++;
                    System.out.println("Código inválido! Tente novamente.");
                }
                
            }

        }   while (cont < 3);


        
        switch(entrada)
        {
            case "1":
                taxa = (idade > 18)?1500:1300;
                c = new PeqCirc(taxa);

                break;

            case "2":
                taxa = (idade > 18)?2300:2000;
                c = new MedCirc(taxa);
                break;

            case "3":
                taxa = 2800;
                lama = true;
                escalada = true;
                c = new AdvCirc(taxa);
                break;

            case "0":
                
                return;

        
        }

           
        
        
        l.add(new Participante(rG, nome, sobrenome, idade, telefoneProprio, telefoneEmergencia, tipoSang, codInscr, c)); 


    }

    public void cancelaPartDireto (int codInscr, List<Participante> l)
    {  
        for (Participante p: l)
        {
            if (codInscr == p.getCodInscr())
            {
                l.remove(p);
            }
        }
    }
    

    public static void cancelaPart (List<Participante> l)
    {

        String nome, sobrenome, rg = "";
        int codInscr; 
        System.out.println("Cancelar Participação\n\n");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println ("1 - Digite seu Nome\n");

        nome = input.nextLine();

        System.out.println ("1 - Digite seu Sobreome\n");

        sobrenome = input.nextLine();

        //nome completo

        System.out.println ("3 - Digite seu RG\n");

        rg = input.nextLine();

        System.out.println ("4 - Digite o Código de inscrição, se preferir.\n");

        codInscr = input.nextInt();

        input.nextLine();

        for (Participante p: l)
        {
            if (nome.equals(p.getNome()) && sobrenome.equals (p.getSobrenome()) && (rg.equals(p.getRG()) || codInscr == (p.getCodInscr())))
            {
                l.remove(p);
            }
        }


    }

    public static void imprimeCat(List<Participante> l)
    {
        
    }

    public static void consultaCat(List<Participante> l)
    {

        String entrada = "";
        String saida = "";
        Scanner input = new Scanner(System.in);

        List<Participante> cat;


        System.out.println
        (
                bigBreak
            +   "        CONSULTAR PARTICIPANTES POR CATEGORIA      "
            +   line

        );

        System.out.println("Selecione uma opção:\n\n");

        System.out.println
        (
                "1 - Circuito Leve;\n"
            +   "2 - Circuito Médio;\n"
            +   "3 - Circuito Avançado;\n"
            +   "Ou \'Qualquer Outra Tecla \'para retornar.\n\n" 
        );

            entrada = input.next();

            switch (entrada)
            { 
                case "1":
                {
                    cat = l.stream().filter(p -> (p.getC() instanceof PeqCirc)).collect(Collectors.toList());
                    System.out.println("1 - Circuito Leve;\n");
                    break;
                }

                case "2":
                {
                    cat = l.stream().filter(p -> (p.getC() instanceof MedCirc)).collect(Collectors.toList());
                    System.out.println("1 - Circuito Médio:\n\n");
                    break;
                }

                case "3":
                {
                    cat = l.stream().filter(p -> (p.getC() instanceof AdvCirc)).collect(Collectors.toList());
                    System.out.println("1 - Circuito Avançado:\n\n");
                    break;
                }



                
                default:
                {
                    System.out.println("Retornanto ao menu principal");
                    System.out.println("1 - Circuito Leve:\n\n");
                    return;
                }
            
                

            }

            for (Participante p: cat)
            {
                System.out.println("\t"+p.getNome()+" " + p.getSobrenome());
            }






    }

    public static void main(String[] args) 
    {

        List<Participante> listaGeral = new ArrayList<>();
        List<Participante> teste = new ArrayList<>();


        PeqCirc c = new PeqCirc(1200);
        listaGeral.add(new Participante("345345234x", "andressa_teste", "souza_teste", 23, "9457457", "4574593", "A", 1, new AdvCirc(2800)));
        listaGeral.add(new Participante("8463453325", "beto_teste", "silva_teste", 16, "6443990", "2483697", "A", 1, new PeqCirc(1300)));
        listaGeral.add(new Participante("2818322956", "samira_teste", "hellburg_test", 19, "996657", "7451535", "B", 1, new PeqCirc(2300)));
        listaGeral.add(new Participante("8463453325", "carlos_teste", "magno_teste", 30, "8142932", "4556598", "O", 1, new MedCirc(1300)));

        /*

        teste = listaGeral.stream().filter(p -> (p.getC() instanceof PeqCirc)).collect(Collectors.toList());
        System.out.println(teste.size() + "ALIGATOR");
                    return;

        */
         

        int cont;

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

            entrada = input.nextLine();

            switch (entrada)
            {
                case "1":
                
                    cadastraPart(listaGeral);
                    break;
                
            
                case "2":
                
                    consultaCat(listaGeral);
                    break;
                
            
                case "3":
                
                    cancelaPart(listaGeral);
                    break;

                case "0":    

                    continua = false;
                    break;

                default:
                
                    
                    break;

            
            }


        } while (continua);

        input.close();
        
    }
}
