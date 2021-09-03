package JAVA_POO_2.Estruturas_Dinamicas.CorridaNaSelva;
public class Participante
{
    private String rG;
    private String nome;
    private String sobrenome;
    private int idade;
    private String telefoneProprio;
    private String telefoneEmergencia;
    private String tipoSang;    
    private final int codInscr;
    private Circuito c;

    public Circuito getC() {
        return c;
    }

    public void setC(Circuito c) {
        this.c = c;
    }


    public Participante
    (
        String rG,
        String nome, 
        String sobrenome,
        int idade, 
        String telefoneProprio, 
        String telefoneEmergencia,
        String tipoSang,
        int codInscr,
        Circuito c
        
    )
    
    {
        this.rG = rG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.telefoneProprio = telefoneProprio;
        this.telefoneEmergencia = telefoneEmergencia;
        this.tipoSang = tipoSang;
        this.codInscr = codInscr;
        this.c = c;
    }



    public int getCodInscr (){
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

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefoneProprio() {
        return this.telefoneProprio;
    }

    public void setTelefoneProprio(String telefoneProprio) {
        this.telefoneProprio = telefoneProprio;
    }

    public String getTelefoneEmergencia() {
        return this.telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }

    public String getTipoSang() {
        return this.tipoSang;
    }

    public void setTipoSang(String tipoSang) {
        this.tipoSang = tipoSang;
    }

    
   

}

    