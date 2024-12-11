package ventas;

import java.util.ArrayList;
import java.util.List;

public class Orden {

  private List<Producto> listaProductos = new ArrayList<Producto>();
  private final int idOrden;
  private Producto[] productos;
  private int contadorProductos;
  private static final int MAX_PRODUCTOS = 10;
  private static int contadorOrdenes;

  public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.productos = new Producto[MAX_PRODUCTOS];
  }

  public void agregarProducto(Producto producto) {
    if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
      this.productos[this.contadorProductos++] = producto;
    } else {
      System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }
  }

  public double calcularTotal() {
    double total = 0;
    for (int i = 0; i < contadorProductos; i++) {
      Producto producto = this.productos[i];
      total += producto.getPrecio();
    }
    return total;
  }

  public void mostrarOrden() {
    System.out.println("Id Orden: " + this.idOrden);
    double totalOrden = this.calcularTotal();
    System.out.println("\tTotal de la orden: $" + totalOrden);
    System.out.println("\tProductos de la orden: ");
    for (var i = 0; i < this.contadorProductos; i++) {
      System.out.println("\t\t" + this.productos[i]);
    }
  }

  @Override
  public String toString() {
    String resultado = "Id Orden: " + this.idOrden + "\n";
    double totalOrden = this.calcularTotal();
    resultado += "\tTotal de la orden: $" + totalOrden + "\n";
    resultado += "\tProductos de la orden: " + "\n";
    for (var i = 0; i < this.contadorProductos; i++) {
      resultado += "\t\t" + this.productos[i] + "\n";
    }
    return resultado;
  }

  public List<Producto> getListaProductos() {
    return listaProductos;
  }

  public void setListaProductos(List<Producto> listaProductos) {
    this.listaProductos = listaProductos;
  }
}
