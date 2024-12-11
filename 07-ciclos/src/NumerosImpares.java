public class NumerosImpares {
  public static void main(String[] args) {
    int contador = 1;
    do {
      if(contador % 2 != 0){
        System.out.println(contador);
      }
      contador++;
    } while(contador <= 20);
  }
}
