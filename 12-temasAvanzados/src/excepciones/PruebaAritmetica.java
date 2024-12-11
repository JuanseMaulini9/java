package excepciones;

public class PruebaAritmetica {
  public static void main(String[] args) {
    try{
      int result = Aritmetica.division(3, 0);
      System.out.println("result = " + result);
    } catch (Exception e){
      System.out.println("error = " + e);
    }
  }
}
