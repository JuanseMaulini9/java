public class DetalleProducto {
    public static void main(String[] args) {
        String productName = "macbook";
        double price = 1250.99;
        int stock = 10;
        boolean isAvailable = true;

        System.out.println("Nombre del producto: " + productName);
        System.out.println("precio: " + price);
        System.out.println("cantidad disponible: " + stock);
        System.out.println("esta disponible para venta: " + isAvailable);

        productName = "ps5";
        price = 399.99;
        stock = 0;
        isAvailable = false;

        System.out.println();
        System.out.println("Nombre del producto: " + productName);
        System.out.println("precio: " + price);
        System.out.println("cantidad disponible: " + stock);
        System.out.println("esta disponible para venta: " + isAvailable);

    }
}
