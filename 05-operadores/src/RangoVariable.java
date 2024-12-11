import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Proporciona un dato entero ");
        int dato = consola.nextInt();

        boolean dentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de rango (1 y 10)? " + dentroRango);

        boolean estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango (1 y 10)? " + estaFueraRango);

    }
}
