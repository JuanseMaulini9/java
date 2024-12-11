import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa el primer numero a comprar: ");
        int numero1 = consola.nextInt();

        System.out.print("Ingresa el segundo numero a comprar: ");
        int numero2 = consola.nextInt();

        int resultado = numero1 > numero2 ? numero1 : numero2;

        System.out.println("El numero mas grande es: " + resultado);

    }
}

