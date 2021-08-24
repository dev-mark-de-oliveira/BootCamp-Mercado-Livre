//import jdk.javadoc.internal.doclets.formats.html.resources.standard;
public class Aula4Ex1 
{
    public static void main (String[]args)
    {

        String delimit = "\n--------------------------------------------\n";
        String bigSpace = "\n\n\n";
        String[] respostas = 
        {
            "String apelido = Gomez;", 
            "int idade = \"35\";",
            "boolean = \"false\";",
            "String saldo = 45857.90",
            "double nome = \"Julián\";"
        };

        String[] correcao = new String [5];
    
        correcao[0] = 
            
            "\n --> O tipo String deve receber o valor entre aspas duplas, do contário o compilador entenderá que o valor é nome de variável.\n\n"
            +   "[correção]: String apelido = gomez;\n"
            +   delimit;

        correcao[1] = 
            
            "\n --> Não se pode usar aspas na atribuiçao de valores numéricos para seus tipos\n"
            +   " --> Devemos usar aspas duplas somente para delimitar o valor das variáveis do tipo String somente. \n\n"
            +   "\n[Correção]: int idade = 35;\n"
            +   delimit;

        correcao[2] =
            
            "\n --> Devemos usar aspas duplas somente para delimitar o valor das variáveis do tipo String somente. \n\n"
            +   "[Correção]: boolean = false;\n"
            +   delimit;

        correcao[3] = 
            "\n --> Qualquer declaraçao, criação ou chamada em Java deve terminar em \';\' (ponto-e-vírgula)! \n"
            +"Devemos usar aspas duplas para declarar o valor de uma variável String.\n\n"
            + "Se desejarmos que saldo seja um número, devemos dar a ele o tipo \'float\' ou \'double\'.\n\n"
            
            +   "[correções]\n\n"
            +   "\tString saldo = \"45857.90\";\n"
            +   "\tfloat saldo = 45857.90f;\n"
            
            + delimit;

        correcao[4] =   
        
            "\n --> O tipo Double é usado para números de ponto flutuante (64 bits). Para nomes usamos \'String\'"
            +   ", como não é recomendado usar caracteres fora da ASCII para este nomes!\n"
            +   "Para armazenar o valor \"Júlian\" na variável \'nome\' é preferível usar o tipo String.\n\n"
            +   "[Correção]: String nome = \"Julian\";";


        
        System.out.println(bigSpace + delimit + "CORREÇÃO DO ALUNO \"FULANO\"" + delimit);
    

        for (int i = 0; i < respostas.length; i++)
        {
            System.out.printf
            (
                "Resposta [%d]: %s\n\n%s", i, respostas[i], correcao[i]
            );
        }

        System.out.println(bigSpace + delimit + bigSpace);

        
    }

}
