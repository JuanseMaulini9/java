import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese el monto que gasta: ");
        double monto = consola.nextFloat();

        System.out.print("Es miembro de la tienda (true/false)? ");
        boolean esMiembro = consola.nextBoolean();

        int descuento;

        if (monto >= 1000.0 && esMiembro) {
            descuento = 10;

        } else if (esMiembro) {
            descuento = 5;

        } else {
            descuento = 0;
        }

        double montoDescuento = monto * (descuento/100.0);

        double total = monto - montoDescuento;
        System.out.printf("""
                obtuviste un descuento del %d%%
                Monto de la compra: $%.2f
                Monto del descuento: $%.2f
                Monto final de la compra: $%.2f
                """, descuento, monto, montoDescuento, total);

    }
}
