package excepciones;

public class Excepciones {
  public static void main(String[] args) {
    int valor1 = 10, valor2 = 0;
    try {
      var result = valor1 / valor2;
      System.out.println("result = " + result);
    } catch (Exception e) {
      System.out.println("Ocurrio un error: " + e);
    }

  }
}