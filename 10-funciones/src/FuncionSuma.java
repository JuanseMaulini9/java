public class FuncionSuma {

  static int sumar(int operando1, int operando2){
    return operando1 + operando2;
  }

  public static void main(String[] args) {
    int arg1 = 4, arg2 = 9;
    int resultado = sumar(arg1, arg2);
    System.out.println("resultado = " + resultado);
  }
}
