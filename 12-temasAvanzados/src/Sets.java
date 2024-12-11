import java.util.TreeSet;
import java.util.Set;

public class Sets {
  public static void main(String[] args) {
    Set<String> conjunto = new TreeSet<>();
    conjunto.add("Juanse");
    conjunto.add("Juanse");
    conjunto.add("Luffy");
    conjunto.add("Zoro");

    conjunto.forEach(System.out::println);

    conjunto.remove("Zoro");
    System.out.println("\nNuevos elementos: ");
    conjunto.forEach(System.out::println);

  }
}
