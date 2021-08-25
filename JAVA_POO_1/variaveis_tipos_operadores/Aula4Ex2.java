public class Aula4Ex2 
{

    public static void main (String[]args)
    {
        String delimit = "\n--------------------------------------------\n";
        String bigSpace = "\n\n\n";
            
        String[] respostas =     
        {       "String 1nome;",
                "int idade;",
                "double $aldo;",
                "String @pellido;",
                "String direcao;",
                "boolean carteira de motorista;",
                "double altura da pessoa;",
                "int quantidade-de-filhos;"
        };

        String[] correcao = 
        {
            "---> Não podemos iniciar nome de variável com número!"
            + "Se necessário, é melhor escrever o número por extenso (parece não ser neste caso)\n\n"
            + "[correção]:\tString nome = \"nome\"",


            "---> Correto!",

            "Usamos \'@\'para fazer marcações de anotações em Java, o que não é o caso aqui."
            + "Não é adequado iniciarmos o nome de variável com caracteres especiais! Estilizações como \'@apelido\'são no mínimo desnecessárias.\n"
            + "E no meio do nome é permitido o underscore, já que outros símbolos podem ser interpretados como operadores.\n\n"
            + "[correção]:\tdouble saldo;\n",

            "--> Não é adequado iniciarmos o nome de variável com caracteres especiais! Estilizações como \'$saldo\'são no mínimo desnecessárias.\n"
            + "E no meio do nome é permitido o underscore, já que outros símbolos podem ser interpretados como operadores.\n\n"
            + "[correção]:\tdouble saldo;\n",

            "\n --> O tipo String deve receber o valor entre aspas duplas, do contário o compilador entenderá que o valor é nome de variável.\n\n"
            +"[correção]:\tString direcao;\n",

            "---> Em java em nomes de variáveis com mais de uma palavra usamos a primeira letra de cada em maiúscula, exceto a primeira (convenção).\n\n"
            + "[correção]:\tboolean carteiraDeMotorista;\n",
            
            "---> Em java em nomes de variáveis com mais de uma palavra usamos a primeira letra de cada em maiúscula, exceto a primeira (convenção).\n\n"
            + "[correção]:\tdouble alturaDaPessoa;\n",

            "---> No meio do nome é permitido o underscore, já que outros símbolos podem ser interpretados como operadores.\n\n"
            + "[correção]: int quantidade-de-filhos;\n"
                
        
        };

        System.out.println(bigSpace + delimit + "CORREÇÃO DO ALUNO \"FULANO\"" + delimit);

        for     (int i = 0; i < respostas.length; i++)
        {
            System.out.printf
            (
                "Resposta [%d]: %s\n%s\n", i+1, respostas[i], correcao[i]
            );
        }

        System.out.println(bigSpace + delimit + bigSpace);

    }    
    
}
