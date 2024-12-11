package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
  private static final List<Snack> snacks;

  // Bloque static inicializador
  static {
    snacks = new ArrayList<>();
    snacks.add(new Snack("Papas", 70));
    snacks.add(new Snack("Coca-cola", 50));
    snacks.add(new Snack("Sanguche", 120));
  }

  public void agregarSnack(Snack snack) {
    snacks.add(snack);
  }

  public void mostrarSnacks() {
    String inventarioSnack = "";
    for (Snack snack : snacks) {
      inventarioSnack += snack.toString() + "\n";
    }
    System.out.println("--- Snacks en el Inventario ---");
    System.out.println(inventarioSnack);
  }

  public List<Snack> getSnacks() {
    return snacks;
  }

}