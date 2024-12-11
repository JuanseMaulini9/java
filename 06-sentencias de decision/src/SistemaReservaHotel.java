import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {

        final double VISTA_MAR = 190.50;
        final double NO_VISTA_MAR = 150.50;

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = consola.nextLine();

        System.out.print("Ingrese los dias de su estadia: ");
        int estadia = consola.nextInt();

        System.out.print("Su cuarto tiene vista al mar (true/false)? ");
        boolean tieneVistaMar = consola.nextBoolean();

        double costoTotal;

        if(tieneVistaMar){
            costoTotal = estadia * VISTA_MAR;
        }else {
            costoTotal = estadia * NO_VISTA_MAR;
        }
        System.out.printf("""
                ---------- Detalle de la Reservacion ----------
                Cliente: %s
                Dias de estadia: %d
                Costo total:  %.2f
                Habitacion con vista al mar: %b
                """, nombre, estadia, costoTotal, tieneVistaMar);
    }
}
