package maquina_snacks_archivos.servicio;

import maquina_snacks.Snacks;
import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks {

  private final String NOMBRE_ARCHIVO = "snacks.txt";
  private List<Snack> snacks = new ArrayList<>();

  public ServicioSnacksArchivos() {
    File archivo = new File(NOMBRE_ARCHIVO);
    boolean existe = false;

    try {
      if (existe) {
        //this.snacks = obtenerSnacks();

      } else {
        PrintWriter salida = new PrintWriter(new FileWriter(archivo));
        salida.close();
        System.out.println("Se ha creado el archivo");
      }
    } catch (Exception e) {
      System.out.println("Error al crear el archivo: " + e.getMessage());
    }

    if (!existe) {
      cargarSnacksIniciales();
    }

  }

  private void cargarSnacksIniciales() {
    this.agregarSnack(new Snack("Papas", 70));
    this.agregarSnack(new Snack("Coca-cola", 50));
    this.agregarSnack(new Snack("Sanguche", 120));
  }

  private List<Snack> obtenerSnacks() {
    List<Snack> snacks = new ArrayList<>();

    try {
      List<String> lines = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
      for(String line : lines){
        String[] lineaSnack = line.split(",");
        String idSnack = lineaSnack[0];
        String nombre = lineaSnack[1];
        double precio = Double.parseDouble(lineaSnack[2]);
        Snack snack = new Snack(nombre, precio);
        snacks.add(snack);
      }
    } catch (Exception e) {
      System.out.println("Error al leer archivos snacks: " + e.getMessage());
      e.printStackTrace();
    }
    return snacks;


  }

  @Override
  public void agregarSnack(Snack snack) {
    // Agregamos el nuevo snack a la lista en memoria
    this.snacks.add(snack);
    // Guardamos el nuevo snack en el archivo
    this.agregarSnackArchivo(snack);
  }

  private void agregarSnackArchivo(Snack snack) {
    boolean anexar = false;
    File archivo = new File(NOMBRE_ARCHIVO);
    try {

      anexar = archivo.exists();
      PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
      salida.println(snack.escribirSnack());
      salida.close();

    } catch (Exception e) {
      System.out.println("Error al agregar snack: " + e.getMessage());
    }
  }

  @Override
  public void mostrarSnacks() {
    System.out.println("--- Snacks en el inventario ---");
    String inventarioSnacks = "";
    for(Snack snack : this.snacks){
      inventarioSnacks += snack.toString() + "\n";
    }
    System.out.println(inventarioSnacks);
  }

  @Override
  public List<Snack> getSnacks() {
    return this.snacks;
  }
}
