import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
  public static void main(String[] args) {
    List<String> miLista = new ArrayList<>();
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");
    miLista.add("Sabado");
    miLista.add("Domingo");


    // for(String dia: miLista){
    //   System.out.println("dia = " + dia);
    // }

    // Funciones lambda (funciones anonimas de un codigo muy compacto)
    // miLista.forEach(elemento -> {
    //   System.out.println("elemento = " + elemento);
    // });

    miLista.forEach(System.out::println);

    List<String> nombres = Arrays.asList("Juanse", "Luffy", "Zoro");
    nombres.forEach(System.out::println);
  }

}
