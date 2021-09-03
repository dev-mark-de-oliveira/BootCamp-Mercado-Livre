package JAVA_POO_3.PI_save_the_ropa;

public class Roupa 
{
    private String marca;
    private String modelo;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Roupa (String marca, String modelo) 
    {
        this.marca = marca;
        this.modelo = modelo;
    }

}
