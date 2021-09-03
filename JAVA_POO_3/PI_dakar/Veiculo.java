package JAVA_POO_3.PI_dakar;

interface SocorroMoto
{ 
    public void socorrer(Moto m);
}
interface SocorroCarro
{ 
    public void socorrer(Carro c);
}

public abstract class Veiculo 
{
    // 1. Criar uma classe de veículo que tenha os seguintes atributos:
    //     ● Velocidade
    //     ● Aceleracao
    //     ● AnguloDeVirada
    //     ● 
    //     ● Peso
    //     + o numero de rodas       
    
    private double velocidade;
    private double aceleracao;
    private double anguloVirada;
    private String placa;
    private final int PESO = 1000;
    private int numRodas;

    


	public double getVelocidade() {
		return this.velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getAceleracao() {
		return this.aceleracao;
	}

	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
	}

	public double getAnguloVirada() {
		return this.anguloVirada;
	}

	public void setAnguloVirada(double anguloVirada) {
		this.anguloVirada = anguloVirada;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int GetPeso() {
		return PESO;
	}

	public int getNumRodas() {
		return this.numRodas;
	}

	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}

    public double getResultado()
    {
        return 0;
    }

    public Veiculo(double velocidade, double aceleracao, double anguloVirada, String placa) 
    {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloVirada = anguloVirada;
        this.placa = placa;
        
    }

    
}

class Moto extends Veiculo
{
   
    private final int PESO = 300;
    private final int NUM_RODAS = 2;


    public Moto(double velocidade, double aceleracao, double anguloVirada, String placa) 
    {
        super(velocidade, aceleracao, anguloVirada, placa);
    }

    @Override
    public double getResultado()
    {
        return(super.getVelocidade()*super.getAceleracao())/(2*(super.getAnguloVirada()*(PESO - NUM_RODAS)));
    }
}

class MotoSocorrista extends Moto implements SocorroMoto
{ 
    


    public MotoSocorrista(double velocidade, double aceleracao, double anguloVirada, String placa) 
    {
        super(velocidade, aceleracao, anguloVirada, placa);
    }

    public  void socorrer(Moto m)
    { 
        if (super.getResultado() > m.getResultado())
        {
            System.out.println("O socorrista ajudou a MOTO: " + m.getPlaca());
        }
    }
}

class Carro extends Veiculo 
{
    
    private final int PESO = 1000;
    private final int NUM_RODAS = 4;

    public Carro (double velocidade, double aceleracao, double anguloVirada, String placa) 
    {
        super(velocidade, aceleracao, anguloVirada, placa);
    }

    @Override
    public double getResultado()
    {
        return(super.getVelocidade()*super.getAceleracao())/(2*(super.getAnguloVirada()*(PESO - NUM_RODAS)));
    }

}

class CarroSocorrista extends Carro implements SocorroCarro
{
    

    public CarroSocorrista (double velocidade, double aceleracao, double anguloVirada, String placa) 
    {
        super(velocidade, aceleracao, anguloVirada, placa);
    }

    public  void socorrer (Carro c)
    { 
        if (super.getResultado() > c.getResultado())
        {
            System.out.println("O socorrista ajudou o CARRO: " + c.getPlaca());
        }
    }

    
    
}