package PI_Carros;

public class Vehicle 
{
    private String marca;
    private String modelo;
    private double valor;

    public Vehicle (String marca, String modelo, double valor)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

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

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override public String toString() 
    {
        String  ret = "[ Modelo:\t" + getModelo() + "\tMarca:\t" + getMarca() + "\tValor:\t" + getValor() + " ]\n\n";
        return ret;
    }
    
    
}
