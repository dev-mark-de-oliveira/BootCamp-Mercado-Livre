package JAVA_POO_4.Pessoa;
public class Pessoa 
{
    private String nome;
    private String id;
    private int idade;
    private double peso;
    private double altura;
    private int cont = 0;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCont() {
        return this.cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public Pessoa()
    {
        nome = "<INVÁLIDO>";
        id = "<INVÁLIDO>";
        idade = 0;
        peso = 0;
        altura = 0;
    }

    private String getNewId()
    {
        cont++;
        Double resp = Math.cos(cont);
        String retorno = Double.toString(resp);
        retorno = retorno.replaceAll("[-]?[0.]+", "");
        retorno = retorno.substring(3, 10);
        return  retorno;

    }

    public Pessoa(String nome, int idade, String id)
    {
        this.nome = nome;
        this.id = id+getNewId();
        this.idade = idade;
        peso = 0;
        altura = 0;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura)
    {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.peso = peso;
        this.altura = (altura < 3 ? altura : altura/100);
    }

    public double calculaIMCExato()
    {
        return peso/Math.pow(altura,2);
    }

    public int calculaIMC()
    {
        double res = calculaIMCExato();
        {
            if (res < 20) return -1;
            if (res > 25) return 1;
            if (res >= 20 && res <= 25) return 0;
            return 2;
        }

    }

    public String TraduzCalculaIMC()
    {
        double res = calculaIMC();
        {
            if (res == -1) return "ABAIXO DO PESO";
            if (res == 0) return "PESO NORMAL";
            if (res == 1) return "ACIMA DO PESO";
            return "<INVÁLIDO>";
        }

    }

    public boolean eMaiorDeIdade()
    {
        if (idade < 18) return false;
        return true;
    }
 
    @Override public String toString()
    {
        String ret =
            "\n___________________________________________________________\n\n"
            +"\t" + "Nome:"   + "\t" + nome   + "\n"
            +"\t" + "ID:"     + "\t" + id   + "\n"
            +"\t" + "Altura:" + "\t" + altura   + "\n"
            +"\t" + "Idade:"   + "\t" + idade   + "\n"
            +"\t" + "Peso:"   + "\t" + peso   + "\n"
            +"\n- - - - - - - - - - I M C - - - - - - - - - -\n\n"
            +"\t" + "IMC:"   + "\t" + calculaIMCExato()   + "\n\n"
            +"\t" + "SITUAÇÃO:"   + "\t" + TraduzCalculaIMC()   + "\n"
            +"- - - - - - - - - - - - - - - - - - - - - - -\n\n"
            ;



            return ret;
    }


}