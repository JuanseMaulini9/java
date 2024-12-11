import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("*** Casa de los espejos ***");

        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = consola.nextInt();
        System.out.print("Le tiene miedo a la oscuridad (true/false)? ");
        boolean miedo = consola.nextBoolean();

        if(edad >= 10 && !miedo){
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}
