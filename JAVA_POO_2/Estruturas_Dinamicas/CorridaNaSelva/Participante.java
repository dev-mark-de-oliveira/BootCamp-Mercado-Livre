public class Participante
{
    private String rG;
    private String nome;
    private String telefone;
    private String tipoSang;
    private int idade;
    private int codArea;
    private int rawTelef;
    final private int codInscr;

    

    public Participante 
    (
        String rG,
        String nome,
        String tipoSang,
        int idade,
        int codArea, 
        int rawtelef,
        int condInscr
    )
    {
        this.rG = rG;
        this.nome = nome;
        this.tipoSang = tipoSang;
        this.idade = idade;
        this.telefone = "(" + codArea + ") " + rawtelef;
        this.codInscr = condInscr;
    }

    public int getCodInsc()
    {
        return codInscr;
    }

    public String getRG() {
        return this.rG;
    }

    public void setRG(String rG) {
        this.rG = rG;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoSang() {
        return this.tipoSang;
    }

    public void setTipoSang(String tipoSang) {
        this.tipoSang = tipoSang;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCodArea() {
        return this.codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public int getRawTelef() {
        return this.rawTelef;
    }

    public void setRawTelef(int rawTelef) {
        this.rawTelef = rawTelef;
    }
    
}    