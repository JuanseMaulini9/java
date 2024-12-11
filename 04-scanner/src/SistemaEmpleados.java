import java.util.Scanner;

public class SistemaEmpleados {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = consola.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = consola.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = consola.nextDouble();

        System.out.print("El empleado es jefe de departamento?  ");
        boolean esJefe = consola.nextBoolean();

        System.out.println();
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("La edad del empleado es: " + edad);
        System.out.printf("El salario del empleado es: $%.2f%n", salario);
        System.out.println("Es jefe de departamento? " + esJefe);
    }

}
