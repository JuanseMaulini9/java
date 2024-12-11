public class ForEach {
  public static void main(String[] args) {
    int edades[] = {5, 10, 30, 45};
    int index = 0;
    for (int edad : edades) {
      System.out.println("Edad del indice: " + index + " = " + edad);
      index++;
    }
  }
}
