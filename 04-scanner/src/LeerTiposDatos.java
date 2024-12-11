import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        
        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        
        // Consumir el caracter de salto de linea
        consola.nextLine();

        // Leer un tipo String
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.println("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        
        // Tipo flotante
        System.out.println("Proporciona un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        //Double.parseDouble();
        //Boolean.parseBoolean();

    }
}
