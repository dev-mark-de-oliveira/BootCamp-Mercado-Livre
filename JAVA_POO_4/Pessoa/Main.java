public class Main 
{
    public static void main(String[] args)
    {
        Pessoa pedro = new Pessoa();
        Pessoa maria = new Pessoa("Maria Graciliana Couto", 52, "VIP_");
        Pessoa frida = new Pessoa ("Maria Friedricka Schwarzmüller", 23, "VIP_",  82.9f, 1.78f);

        System.out.println("\n\n");
        System.out.println(pedro.toString());
        System.out.println(maria.toString()); //
        System.out.println(frida.toString()); //
        System.out.println("\n\n");

        
    }    
}
