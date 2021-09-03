package JAVA_POO_1.estruturas_controle.Ex4;

public class Entrevistado
{
    private String nome;
    private boolean a;
    private boolean b;
    private boolean c;

    public Entrevistado(String nome, boolean a, boolean b, boolean c)
    {
        this.nome = nome;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isC() {
        return c;
    }

    public void setC(boolean c) {
        this.c = c;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public boolean isA() {
        return a;
    }

    public void setA(boolean a) {
        this.a = a;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
