import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        System.out.println("*** Area y Perimetro ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la base del resctangulo: ");
        float base = consola.nextFloat();

        System.out.print("Ingrese la altura del resctangulo: ");
        float altura = consola.nextFloat();

        float perimetro = 2 * (base + altura);
        float area = base * altura;

        System.out.printf("""
                Perimetro = %.2f
                Area = %.2f
                """, perimetro, area);

    }
}
