public class Cliente 
{
    private final String nome;
    private String tel;
    private String servId;

    public Cliente (String nome, String tel, String servId)
    {
        this.nome       = nome;
        this.tel        = tel;
        this.servId     = servId;
    }

    public String getServId() {
        return servId;
    }

    public void setServId(String servId) {
        this.servId = servId;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }


}
