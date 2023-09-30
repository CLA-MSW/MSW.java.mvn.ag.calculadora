package miPrincipal;

public class App {
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println("CALCULADORA BASICA");
        System.out.println("------------------");

        System.out.println("2+3="+c.suma(2, 3));
    }
}