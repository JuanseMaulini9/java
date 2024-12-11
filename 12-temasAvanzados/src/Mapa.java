import java.util.HashMap;
import java.util.Map;

public class Mapa {
  public static void main(String[] args) {
    Map<String, String> persona = new HashMap<>();
    persona.put("nombre", "Juanse");
    persona.put("apellido", "Maulini");
    persona.put("edad", "24");
    persona.put("edad", "24"); // No se permiten duplicados
    System.out.println("Valores del mapa: ");
    persona.entrySet().forEach(System.out::println);
    persona.put("edad", "35"); // Modificar el valor de la llave existente
    persona.remove("apellido");
    System.out.println("\nNuevos valores del mapa:");
    persona.entrySet().forEach(System.out::println);

    System.out.println("\nIterando los elementos (llave, valor)");
    persona.forEach((llave, valor) -> {
      System.out.println("LLave: " + llave + ", Valor: " + valor);
    });
  }
}
