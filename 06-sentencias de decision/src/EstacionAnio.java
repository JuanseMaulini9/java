import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un mes del años (numero): ");
        int mes = consola.nextInt();
        String estacion;

        estacion = switch(mes){
            case 1,2,12 -> "Invierno";
            case 3,4,5 -> "Primavera";
            case 6,7,8 -> "Verano";
            case 9,10,11 -> "Otoño";
            default -> "Mes invalido";
        };

        System.out.println(estacion);
    }
}
