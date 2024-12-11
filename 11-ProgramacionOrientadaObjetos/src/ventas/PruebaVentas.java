package ventas;

public class PruebaVentas {
  public static void main(String[] args) {
    System.out.println("*** Sistema de ventas ***");

    Producto producto1 = new Producto("PS5", 500.00);

    Producto producto2 = new Producto("Xbox SerieX", 400.00);

    Producto producto3 = new Producto("Nintendo Switch", 350.00);

    Orden orden1 = new Orden();
    orden1.agregarProducto(producto1);
    orden1.agregarProducto(producto2);
    orden1.getListaProductos().add(producto1);
    orden1.getListaProductos().add(producto3);
    System.out.println("Lista: " + orden1.getListaProductos());
    //orden1.mostrarOrden();

    Orden orden2 = new Orden();
    orden2.agregarProducto(producto3);
    orden2.agregarProducto(new Producto("PC", 950.00));
    //orden2.mostrarOrden();

    System.out.println(orden1);
    System.out.println(orden2);
  }
}
