import java.util.Scanner;

public class Numeropositivo {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea evaluar ");
        int numero = consola.nextInt();

        if(numero > 0){
            System.out.println("Es positivo");
        } else if(numero < 0){
            System.out.println("Es negativo");
        } else {
            System.out.println("Es 0");
        }
    }
}
