public class SumaIterativa {
  public static void main(String[] args) {

    int resultado = 0;
    final int MAXIMO = 5;

    for (int i = 1; i <= MAXIMO; i++) {
      resultado = resultado + i;
    }
    System.out.println(resultado);

  }
}
