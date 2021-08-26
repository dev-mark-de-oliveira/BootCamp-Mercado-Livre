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


    @Override
    public String toString() {
        return "Product{" +
                "\tnome:\t" + name + ",\n" +
                "\tpreco:\t " + price +
                "\n}";
    }

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public Product(){}

    public double calcule (int quantidadeOfProdutos)
    {
        return (double)quantidadeOfProdutos * getPrice();
    }

















}
