import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        System.out.println("*** Deascuento VIP ***");

        Scanner consola = new Scanner(System.in);
        final int NO_PRODUCTOS_DESCUENTOS = 10;
        int articulos;
        boolean esMiembro;

        System.out.print("Cuantos articulos compra? ");
        articulos = consola.nextInt();

        System.out.print("Es miembro de la tienda? (true/false) ");
        esMiembro = consola.nextBoolean();

        boolean result = articulos >= NO_PRODUCTOS_DESCUENTOS && esMiembro;
        System.out.println("tiene acceso al descuento? " + result);
    }
}
