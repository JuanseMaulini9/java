import java.util.Scanner;

public class ValorRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro de Rango ***");

        Scanner consola = new Scanner(System.in);
        final int MINIMO = 3;
        final int MAXIMO = 6;

        System.out.println("Ingrese un valor numerico");
        int valor = consola.nextInt();

        boolean resultado = valor >= MINIMO && valor <= MAXIMO;
        System.out.println("El valor ingresado esta en el rango de " + MINIMO + " y " + MAXIMO + "? " + resultado );

    }
}
