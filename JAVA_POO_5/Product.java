public class Product 
{
    /*
    Exercício 1
    Crie uma classe Product que possua os seguintes atributos: String name e double price, deve
definir os métodos getters e setters para seus atributos, um construtor que recebe todos os
seus atributos como parâmetro e o método toString (). Crie o método calcule () para o qual
iremos passar um parâmetro do tipo int chamado quantidadeOfProdutos; Este método tem
que multiplicar o preço pela quantidade de produtos anteriores. */    

    private String name;
    private double price;
    private int quantidadeOfProdutos = 0;

    public int getQuantidadeOfProdutos() {
        return this.quantidadeOfProdutos;
    }

    public void setQuantidadeOfProdutos(int quantidadeOfProdutos) {
        this.quantidadeOfProdutos = quantidadeOfProdutos;
    }
    


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    
    public String toString() 
    {
        return 
                    "\tNome: "         +   getName()
                +   "\tQtde.: "   +   getQuantidadeOfProdutos()
                +   "\tPr_Unt.: "  +   String.format("R$ %.2f", getPrice())
                +   "\tPr_Tot.: " +   String.format("R$ %.2f", calcule())
                ;
    }

    public Product(String name, double price, int quantidadeOfProdutos)
    {
        this.name = name;
        this.price = price;
        this.quantidadeOfProdutos = quantidadeOfProdutos;
    }

    public Product(){}

    public double calcule ()
    {
        return (double)quantidadeOfProdutos * getPrice();
    }

















}
