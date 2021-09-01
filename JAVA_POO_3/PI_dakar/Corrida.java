import java.util.List;
import java.util.ArrayList;

public class Corrida 
{
    // Modelar a classe Corrida que tem os seguintes atributos:
    //     ● Distancia
    //     ● PremioEmDolares
    //     ● Nome

    //     ● QuantidadeDeVeiculosPermitidos
    //     ● ListaDeVeiculos
    
    private double distancia;
    private double premioEmDolares;
    private String NOME;
    private final int QuantidadeDeVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos = new ArrayList<>();
   
    public List<Veiculo> getLista() {
        return listaDeVeiculos;
    }

    public Corrida(double distancia, double premioEmDolares, String NOME, int QuantidadeDeVeiculosPermitidos)  
    {
        this.distancia = distancia;
        this. premioEmDolares = premioEmDolares;
        this. NOME = NOME;
        this.QuantidadeDeVeiculosPermitidos = QuantidadeDeVeiculosPermitidos;
    }

    public Corrida(double distancia, double premioEmDolares, String NOME, int QuantidadeDeVeiculosPermitidos, List<Veiculo> listaDeVeiculos)  
    {
        //para testes!
        this.distancia = distancia;
        this. premioEmDolares = premioEmDolares;
        this. NOME = NOME;
        this.QuantidadeDeVeiculosPermitidos = QuantidadeDeVeiculosPermitidos;
        if (listaDeVeiculos.size() <= QuantidadeDeVeiculosPermitidos) 
        {
            this.listaDeVeiculos = listaDeVeiculos;
        }

        else
        {
            System.out.println("Número de veículos excedido! Adicione os carros manualmente");
        }

    }

    public void adicionaVeiculo (Veiculo v)
    {
        if (listaDeVeiculos.size() < QuantidadeDeVeiculosPermitidos)
        { 
            listaDeVeiculos.add(v);
        }

        else System.out.println("Inserção não permitida!\n\n");
    }
    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolares() {
        return this.premioEmDolares;
    }

    public void setPremioEmDolares(double premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    

    public String getNOME() {
        return this.NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public int getQuantidadeDeVeiculosPermitidos() {
        return this.QuantidadeDeVeiculosPermitidos;
    }



    public void adicionarCarro(double velocidade, double aceleracao, double AnguloDeVirada, String placa)
    {
        listaDeVeiculos.add(new Carro(velocidade, aceleracao, AnguloDeVirada, placa));
    }

    public void adicionarMoto(double velocidade, double aceleracao, double AnguloDeVirada, String placa)
    {
        listaDeVeiculos.add(new Moto(velocidade, aceleracao, AnguloDeVirada, placa));
    }

    public void removerVeiculo(Veiculo veiculo)
    {
        listaDeVeiculos.remove(veiculo);
    }
    public void removeVeiculoComPlaca(String umaPlaca)
    {
        for (Veiculo v: listaDeVeiculos)
        {
            if (v.getPlaca().equals(umaPlaca))
            {
                removerVeiculo(v);
            }
        }
    }

    
        
            // 6. Queremos ser capazes de definir o vencedor de uma corrida:
            // O vencedor será aquele que tiver o valor máximo determinado pela seguinte fórmula:
            // Velocidade * 1⁄2 Aceleração / (AnguloDeVirada*(Peso - NumeroDeRodas * 100).


    }


