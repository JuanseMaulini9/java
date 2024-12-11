import java.util.Scanner;

public class GeneracionTicket {
    public static void main(String[] args) {
        System.out.println("*** Generacion ticket venta ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        double precioLeche = consola.nextDouble();

        System.out.print("Precio pan: ");
        double precioPan = consola.nextDouble();

        System.out.print("Precio lechuga: ");
        double precioLechuga = consola.nextDouble();

        System.out.print("Precio banana: ");
        double precioBanana = consola.nextDouble();

        double subtotal = precioBanana + precioLechuga + precioLeche + precioPan;
        System.out.println("Aplicar algun descuento (%)? ");
        int descuentoPorcentaje = consola.nextInt();

        double descuento = subtotal * (descuentoPorcentaje / 100.0);

        double subtotalConDescuento = subtotal - descuento;
        double impuesto = subtotalConDescuento * .21;

        double total = subtotalConDescuento + impuesto;

        System.out.printf("""
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto: (21%%): $%.2f
                Total: $%.2f
                """,subtotal,descuento, descuentoPorcentaje, impuesto, total);
    }
}
